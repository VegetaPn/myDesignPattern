package com.yanhaonan;

import com.yanhaonan.iface.Image;
import com.yanhaonan.impl.ProxyImage;

/**
 * Created by Vegeta on 2/21/17.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_100mb");

        image.display();
        System.out.println("---");
        image.display();
    }
}
