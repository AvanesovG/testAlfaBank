package com.avanes.testAlfaBank.config;

import org.springframework.context.annotation.Configuration;

@Configuration

public class ConfigProperties {
    private String app_id;
    private String base;

    public ConfigProperties() {
    }

    public ConfigProperties(String app_id, String base) {
        this.app_id = app_id;
        this.base = base;
    }


    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
