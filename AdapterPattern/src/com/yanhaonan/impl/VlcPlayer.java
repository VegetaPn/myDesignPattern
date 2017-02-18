package com.yanhaonan.impl;

import com.yanhaonan.iface.AdvancedMediaPlayer;

/**
 * Created by Vegeta on 2/19/17.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String title) {
        System.out.println("Playing vlc file. Name: " + title);
    }

    @Override
    public void playMp4(String title) {
        // Do nothing
    }
}
