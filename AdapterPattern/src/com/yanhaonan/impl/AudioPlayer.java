package com.yanhaonan.impl;


import com.yanhaonan.iface.MediaPlayer;
import org.springframework.stereotype.Component;

/**
 * Created by Vegeta on 2/19/17.
 */
@Component
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String mediaType, String title) {
        if (mediaType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + title);
        } else if (mediaType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter("vlc");
            mediaAdapter.play("vlc", title);
        } else if (mediaType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter("mp4");
            mediaAdapter.play("mp4", title);
        } else {
            System.out.println("Invalid media. " + mediaType + " format not supported");
        }
    }
}
