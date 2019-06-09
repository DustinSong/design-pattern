package cn.zenyatta.learn.designpattern.abstractfactory;

import cn.zenyatta.learn.designpattern.common.Color;
import cn.zenyatta.learn.designpattern.common.Shape;

/**
 * @author mingming.song
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
