package com.yanhaonan.impl;

import com.yanhaonan.iface.AdvancedMediaPlayer;

/**
 * Created by Vegeta on 2/19/17.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String title) {
        // Do nothing
    }

    @Override
    public void playMp4(String title) {
        System.out.println("Playing mp4 file. Name: " + title);
    }
}
