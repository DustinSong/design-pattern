package cn.zenyatta.learn.designpattern.common;

/**
 * @author mingming.song
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
