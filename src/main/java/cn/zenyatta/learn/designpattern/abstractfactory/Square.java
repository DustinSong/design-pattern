package cn.zenyatta.learn.designpattern.abstractfactory;

/**
 * @author mingming.song
 */
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
