package com.ratel.info.config;

import com.ratel.info.api.constants.InfoDataSourceType;
import com.ratel.info.impl.api.dao.BaseMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

import com.ratel.info.api.constants.InfoDataSourceType;


@Configurable
@MapperScan(basePackages = {"com.ratel.info.impl.api.dao"}, sqlSessionFactoryRef = "sqlSessionFactoryInfo")
public class InfoDataConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.master.datasource")
    public DataSource masterDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.slave1.datasource")
    public DataSource slave1DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public DynamicDataSource infoDynamicdataSource(@Qualifier("masterDataSource") DataSource materDataSource,
                                                   @Qualifier("slave1DataSource") DataSource slave1DataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(InfoDataSourceType.MASTER, materDataSource);
        targetDataSources.put(InfoDataSourceType.SLAVE1, slave1DataSource);

        DynamicDataSource dataSource = new DynamicDataSource();
        dataSource.setTargetDataSources(targetDataSources);
        dataSource.setDefaultTargetDataSource(materDataSource);

        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryInfo(@Qualifier("infoDynamicdataSource") DynamicDataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factoryBean.setMapperLocations(resolver.getResources("classpath:sqlmap/**/*.xml"));
        factoryBean.setTypeAliasesPackage("com.ratel.info.api.model");
        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactoryInfo") SqlSessionFactory sqlSessionFactoryInfo) throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryInfo);
        return template;
    }

    @Bean
    public DataSourceTransactionManager infoTransactionManager(@Qualifier("infoDynamicdataSource") DynamicDataSource masterDataSource) {
        DataSourceTransactionManager trx = new DataSourceTransactionManager();
        trx.setDataSource(masterDataSource);
        return trx;
    }

    public static void setDatabaseType(InfoDataSourceType type) {
        DatabaseContextHolder.setDatabaseType(type);
    }
}

class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getDatabaseType();
    }
}


class DatabaseContextHolder {
    private static final ThreadLocal<InfoDataSourceType> contextHolder = new ThreadLocal<>();

    public static void setDatabaseType(InfoDataSourceType type) {
        contextHolder.set(type);
    }

    public static InfoDataSourceType getDatabaseType() {
        return contextHolder.get();
    }
}


