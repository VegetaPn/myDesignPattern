package me.yanhaonan.abstractfactory.factory;

import me.yanhaonan.abstractfactory.product.AbstractProductA;
import me.yanhaonan.abstractfactory.product.AbstractProductB;

/**
 * Created by Vegeta on 7/15/17.
 */
public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
