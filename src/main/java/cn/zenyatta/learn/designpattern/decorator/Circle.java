package cn.zenyatta.learn.designpattern.decorator;

/**
 * @author mingming.song
 */
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
