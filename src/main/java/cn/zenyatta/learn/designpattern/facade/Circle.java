package cn.zenyatta.learn.designpattern.facade;


/**
 * @author mingming.song
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
