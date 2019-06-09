package cn.zenyatta.learn.designpattern.abstractfactory;

import cn.zenyatta.learn.designpattern.common.*;
import org.apache.commons.lang3.StringUtils;

/**
 * @author mingming.song
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        switch (StringUtils.upperCase(color)){
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            case "BLUE":
                return new Blue();
                default:
                    return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        throw new UnsupportedOperationException();
    }
}
