package com.yoshi.merchants.models;

/**
 * Created by Multiplica on 10/09/2017.
 */

public class Location {

    public Location(String name, String implement, String service, String quantitySportField) {
        this.name = name;
        this.implement = implement;
        this.service = service;
        this.quantitySportField = quantitySportField;
    }

    private String name;
    private String implement;
    private String service;
    private String quantitySportField;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImplement() {
        return implement;
    }

    public void setImplement(String implement) {
        this.implement = implement;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getQuantitySportField() {
        return quantitySportField;
    }

    public void setQuantitySportField(String quantitySportField) {
        this.quantitySportField = quantitySportField;
    }
}
