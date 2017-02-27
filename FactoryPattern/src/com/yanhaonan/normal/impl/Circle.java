package com.yanhaonan.normal.impl;

import com.yanhaonan.normal.iface.Shape;

/**
 * Created by Vegeta on 2/28/17.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
