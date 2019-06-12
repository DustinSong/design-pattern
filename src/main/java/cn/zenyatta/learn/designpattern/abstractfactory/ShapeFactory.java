package cn.zenyatta.learn.designpattern.abstractfactory;

import org.apache.commons.lang3.StringUtils;

/**
 * @author mingming.song
 */
class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        throw new UnsupportedOperationException();
    }

    @Override
    Shape getShape(String shape) {
        switch (StringUtils.upperCase(shape)) {
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
