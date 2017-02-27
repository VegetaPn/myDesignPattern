package com.yanhaonan.factory.method.impl;

import com.yanhaonan.factory.method.iface.Factory;
import com.yanhaonan.factory.method.iface.Product;

/**
 * Created by Vegeta on 2/28/17.
 */
public class ConcreteFactory extends Factory {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
