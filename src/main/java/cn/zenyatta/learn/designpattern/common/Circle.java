package cn.zenyatta.learn.designpattern.common;

/**
 * @author mingming.song
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
