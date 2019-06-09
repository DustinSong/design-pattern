package cn.zenyatta.learn.designpattern.common;

/**
 * @author mingming.song
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
