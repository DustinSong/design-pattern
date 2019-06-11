package cn.zenyatta.learn.designpattern.builder;

/**
 * @author mingming.song
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
