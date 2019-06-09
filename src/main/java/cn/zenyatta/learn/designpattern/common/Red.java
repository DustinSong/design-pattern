package cn.zenyatta.learn.designpattern.common;

/**
 * @author mingming.song
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
