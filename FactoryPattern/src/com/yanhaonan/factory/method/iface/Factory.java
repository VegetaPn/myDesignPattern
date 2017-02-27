package com.yanhaonan.factory.method.iface;

/**
 * Created by Vegeta on 2/28/17.
 */
public abstract class Factory {
    public Product doSomething() {
        Product product = factoryMethod();
        return product;
    }

    protected abstract Product factoryMethod();
}
