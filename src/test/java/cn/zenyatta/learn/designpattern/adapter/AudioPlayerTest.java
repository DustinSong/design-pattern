package cn.zenyatta.learn.designpattern.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class AudioPlayerTest {

    @Test
    public void play() {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}