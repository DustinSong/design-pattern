package cn.zenyatta.learn.designpattern.facade;

/**
 * @author mingming.song
 */
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
