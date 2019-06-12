package cn.zenyatta.learn.designpattern.abstractfactory;

/**
 * @author mingming.song
 */
abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
