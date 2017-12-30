package com.ratel.info.config;

import com.ratel.info.api.constants.InfoDataSourceType;

public class DatabaseContextHolder {
    private static final ThreadLocal<InfoDataSourceType> contextHolder = new ThreadLocal<>();

    public static void setDatabaseType(InfoDataSourceType type) {
        contextHolder.set(type);
    }

    public static InfoDataSourceType getDatabaseType() {
        return contextHolder.get();
    }
}