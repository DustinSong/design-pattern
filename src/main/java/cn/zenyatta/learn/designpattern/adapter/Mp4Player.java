package cn.zenyatta.learn.designpattern.adapter;

/**
 * @author mingming.song
 */
class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
