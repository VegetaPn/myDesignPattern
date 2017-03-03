package com.yanhaonan.bean;

/**
 * Created by Vegeta on 3/3/17.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
