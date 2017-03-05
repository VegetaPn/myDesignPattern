package com.yanhaonan.bean;

import com.yanhaonan.iface.Component;

/**
 * Created by Vegeta on 3/5/17.
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
       this.name = name;
    }

    @Override
    public void add(Component component) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        String dpStr = new String(new char[depth]).replace("\0", "-");

        System.out.println(dpStr + name);
    }
}
