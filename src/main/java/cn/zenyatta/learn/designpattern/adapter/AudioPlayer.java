package cn.zenyatta.learn.designpattern.adapter;

import org.apache.commons.lang3.StringUtils;

/**
 * @author mingming.song
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        switch (StringUtils.upperCase(audioType)) {
            case "MP3":
                System.out.println("Playing mp3 file. Name: " + fileName);
                break;
            case "VLC":
            case "MP4":
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
                break;
            default:
                System.out.println("Invalid player");
        }
    }
}
