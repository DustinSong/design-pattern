package cn.zenyatta.learn.designpattern.factory;

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
