package cn.zenyatta.learn.designpattern.adapter;

import org.apache.commons.lang3.StringUtils;

/**
 * @author mingming.song
 */
class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        switch (StringUtils.upperCase(audioType)) {
            case "VLC":
                advancedMediaPlayer = new VlcPlayer();
                break;
            case "MP4":
                advancedMediaPlayer = new Mp4Player();
                break;
            default:
                advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (StringUtils.upperCase(audioType)) {
            case "VLC":
                advancedMediaPlayer.playVlc(fileName);
                break;
            case "MP4":
                advancedMediaPlayer.playMp4(fileName);
                break;
            default:
                advancedMediaPlayer.playVlc(fileName);
        }
    }
}
