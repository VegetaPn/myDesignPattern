package me.yanhaonan.abstractfactory;

import me.yanhaonan.abstractfactory.factory.AbstractFactory;
import me.yanhaonan.abstractfactory.factory.ConcreteFactory1;
import me.yanhaonan.abstractfactory.factory.ConcreteFactory2;

/**
 * Created by Vegeta on 7/15/17.
 */
public class FactoryMaker {
    private static AbstractFactory factory = null;

    public static AbstractFactory chooseFactory(String choice) {
        if ("a".equals(choice)) {
            factory = new ConcreteFactory1();
        } else if ("b".equals(choice)) {
            factory = new ConcreteFactory2();
        }
        return factory;
    }
}
