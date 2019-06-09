package cn.zenyatta.learn.designpattern.factory;

import cn.zenyatta.learn.designpattern.common.Circle;
import cn.zenyatta.learn.designpattern.common.Rectangle;
import cn.zenyatta.learn.designpattern.common.Shape;
import cn.zenyatta.learn.designpattern.common.Square;
import org.apache.commons.lang3.StringUtils;

/**
 * @author mingming.song
 */
public class ShapeFactory {

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
