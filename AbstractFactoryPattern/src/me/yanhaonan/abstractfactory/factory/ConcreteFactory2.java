package me.yanhaonan.abstractfactory.factory;

import me.yanhaonan.abstractfactory.product.AbstractProductA;
import me.yanhaonan.abstractfactory.product.AbstractProductB;
import me.yanhaonan.abstractfactory.product.ProductA2;
import me.yanhaonan.abstractfactory.product.ProductB2;

/**
 * Created by Vegeta on 7/15/17.
 */
public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
