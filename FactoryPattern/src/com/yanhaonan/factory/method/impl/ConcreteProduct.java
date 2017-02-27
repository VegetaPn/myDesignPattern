package com.yanhaonan.factory.method.impl;

import com.yanhaonan.factory.method.iface.Product;
import lombok.Data;

/**
 * Created by Vegeta on 2/28/17.
 */
@Data
public class ConcreteProduct implements Product {
    private String name = "ConcreteProduct";

    @Override
    public void printName() {
        System.out.println(this.name);
    }
}
