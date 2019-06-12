package cn.zenyatta.learn.designpattern.abstractfactory;

import org.apache.commons.lang3.StringUtils;

/**
 * @author mingming.song
 */
class FactoryProducer {
    public static AbstractFactory getFactory(String chioce) {
        switch (StringUtils.upperCase(chioce)) {
            case "SHAPE":
                return new ShapeFactory();
            case "COLOR":
                return new ColorFactory();
            default:
                return null;
        }
    }

}
