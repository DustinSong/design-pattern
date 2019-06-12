package cn.zenyatta.learn.designpattern.abstractfactory;

/**
 * @author mingming.song
 */
class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
