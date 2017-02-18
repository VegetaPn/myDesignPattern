package com.yanhaonan.impl;

import com.yanhaonan.iface.AdvancedMediaPlayer;
import com.yanhaonan.iface.MediaPlayer;

/**
 * Created by Vegeta on 2/19/17.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (mediaType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String mediaType, String title) {
       if (mediaType.equalsIgnoreCase("vlc")) {
           advancedMediaPlayer.playVlc(title);
       } else if (mediaType.equalsIgnoreCase("mp4")) {
           advancedMediaPlayer.playMp4(title);
       }
    }
}
