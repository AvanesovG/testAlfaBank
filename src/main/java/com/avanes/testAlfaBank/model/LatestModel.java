package com.avanes.testAlfaBank.model;

import java.util.HashMap;

public class LatestModel {

    private String disclaimer;
    private String license;
    private long timestamp;
    private String currency;
    private HashMap<String,String>rates;

    public LatestModel() {
    }

    public LatestModel(String disclaimer, String license, long timestamp,
                       String currency, HashMap<String, String> rates) {
        this.disclaimer = disclaimer;
        this.license = license;
        this.timestamp = timestamp;
        this.currency = currency;
        this.rates = rates;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public HashMap<String, String> getRates() {
        return rates;
    }

    public void setRates(HashMap<String, String> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "LatestModel{" +
                "disclaimer='" + disclaimer + '\'' +
                ", license='" + license + '\'' +
                ", timestamp=" + timestamp +
                ", currency='" + currency + '\'' +
                ", rates=" + rates +
                '}';
    }
}
