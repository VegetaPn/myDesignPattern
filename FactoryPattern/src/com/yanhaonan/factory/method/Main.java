package com.yanhaonan.factory.method;

import com.yanhaonan.factory.method.iface.Factory;
import com.yanhaonan.factory.method.iface.Product;
import com.yanhaonan.factory.method.impl.ConcreteFactory;

/**
 * Created by Vegeta on 2/28/17.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.doSomething();
        product.printName();
    }
}
