package com.yanhaonan.normal.impl;

import com.yanhaonan.normal.iface.Image;

/**
 * Created by Vegeta on 2/20/17.
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
