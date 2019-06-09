package cn.zenyatta.learn.designpattern.common;

/**
 * @author mingming.song
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
