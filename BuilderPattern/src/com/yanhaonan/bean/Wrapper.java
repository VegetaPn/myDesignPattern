package com.yanhaonan.bean;

import com.yanhaonan.iface.Packing;

/**
 * Created by Vegeta on 3/3/17.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
