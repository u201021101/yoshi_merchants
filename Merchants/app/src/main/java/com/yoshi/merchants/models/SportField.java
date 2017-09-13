package com.yoshi.merchants.models;

/**
 * Created by Multiplica on 12/09/2017.
 */

public class SportField {
    public SportField(String name, int quantityPlayer) {
        this.name = name;
        this.quantityPlayer = quantityPlayer;
    }

    private String name;
    private int quantityPlayer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityPlayer() {
        return quantityPlayer;
    }

    public void setQuantityPlayer(int quantityPlayer) {
        this.quantityPlayer = quantityPlayer;
    }
}
