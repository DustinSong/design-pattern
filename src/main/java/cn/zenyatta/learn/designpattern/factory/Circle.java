package cn.zenyatta.learn.designpattern.factory;

/**
 * @author mingming.song
 */
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
