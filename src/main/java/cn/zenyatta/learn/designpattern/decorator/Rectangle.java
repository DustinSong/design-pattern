package cn.zenyatta.learn.designpattern.decorator;

/**
 * @author mingming.song
 */
class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
