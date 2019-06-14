package cn.zenyatta.learn.designpattern.facade;

/**
 * @author mingming.song
 */
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
