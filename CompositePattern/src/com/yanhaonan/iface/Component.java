package com.yanhaonan.iface;

/**
 * Created by Vegeta on 3/5/17.
 */
public interface Component {
    void add(Component component);
    void remove(Component component);
    void display(int depth);
}
