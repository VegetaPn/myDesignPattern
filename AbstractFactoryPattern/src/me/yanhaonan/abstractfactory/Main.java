package me.yanhaonan.abstractfactory;

import me.yanhaonan.abstractfactory.factory.AbstractFactory;
import me.yanhaonan.abstractfactory.product.AbstractProductA;
import me.yanhaonan.abstractfactory.product.AbstractProductB;

/**
 * Created by Vegeta on 7/15/17.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = FactoryMaker.chooseFactory("a");
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();

        AbstractFactory factory2 = FactoryMaker.chooseFactory("b");
        AbstractProductA productA2 = factory1.createProductA();
        AbstractProductB productB2 = factory1.createProductB();
    }
}
