package com.yanhaonan.bean;

import com.yanhaonan.iface.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vegeta on 3/5/17.
 */
public class Composite implements Component {

    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        String dpStr = new String(new char[depth]).replace("\0", "-");

        System.out.println(dpStr.toString() + name);

        for (Component component : children) {
            component.display(depth + 2);
        }
    }

}
