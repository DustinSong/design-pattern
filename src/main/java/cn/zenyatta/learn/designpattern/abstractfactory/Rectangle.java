package cn.zenyatta.learn.designpattern.abstractfactory;

/**
 * @author mingming.song
 */
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
