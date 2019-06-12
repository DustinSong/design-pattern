package cn.zenyatta.learn.designpattern.factory;

import cn.zenyatta.learn.designpattern.abstractfactory.Circle;
import cn.zenyatta.learn.designpattern.abstractfactory.Rectangle;
import cn.zenyatta.learn.designpattern.abstractfactory.Square;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class FactoryTest {

    @Test
    public void getShare() {
        assertTrue("获取Sequre失败", ShapeFactory.getShape("Square") instanceof Square);
        assertTrue("获取Circle失败", ShapeFactory.getShape("Circle") instanceof Circle);
        assertTrue("获取Rectangle失败", ShapeFactory.getShape("Rectangle") instanceof Rectangle);
    }
}