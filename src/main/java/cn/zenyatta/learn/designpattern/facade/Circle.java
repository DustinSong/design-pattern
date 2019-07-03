package cn.zenyatta.learn.designpattern.facade;


/**
 * @author mingming.song
 */
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
