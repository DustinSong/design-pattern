package cn.zenyatta.learn.designpattern.factory;

import cn.zenyatta.learn.designpattern.abstractfactory.Circle;
import cn.zenyatta.learn.designpattern.abstractfactory.Rectangle;
import cn.zenyatta.learn.designpattern.abstractfactory.Shape;
import cn.zenyatta.learn.designpattern.abstractfactory.Square;
import org.apache.commons.lang3.StringUtils;

/**
 * @author mingming.song
 */
class ShapeFactory {

    public static Shape getShape(String shapeType) {
        switch (StringUtils.upperCase(shapeType)) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
