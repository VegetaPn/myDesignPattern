package com.yanhaonan.bean;

/**
 * Created by Vegeta on 3/3/17.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
