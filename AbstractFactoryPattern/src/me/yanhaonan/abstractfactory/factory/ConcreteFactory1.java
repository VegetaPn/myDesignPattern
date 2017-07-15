package me.yanhaonan.abstractfactory.factory;

import me.yanhaonan.abstractfactory.product.AbstractProductA;
import me.yanhaonan.abstractfactory.product.AbstractProductB;
import me.yanhaonan.abstractfactory.product.ProductA1;
import me.yanhaonan.abstractfactory.product.ProductB1;

/**
 * Created by Vegeta on 7/15/17.
 */
public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
