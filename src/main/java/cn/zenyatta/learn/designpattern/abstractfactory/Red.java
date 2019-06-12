package cn.zenyatta.learn.designpattern.abstractfactory;

/**
 * @author mingming.song
 */
class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
