package com.yanhaonan.bean;

import com.yanhaonan.iface.Item;
import com.yanhaonan.iface.Packing;

/**
 * Created by Vegeta on 3/3/17.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
