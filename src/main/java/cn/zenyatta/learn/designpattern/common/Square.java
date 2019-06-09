package cn.zenyatta.learn.designpattern.common;

/**
 * @author mingming.song
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
