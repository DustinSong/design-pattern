package cn.zenyatta.learn.designpattern.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class ShapeCacheTest {

    @Test
    public void getShape() {
        ShapeCache.loadCache();

        for (int i = 1; i < 7; i++) {
            Shape cloneShape = ShapeCache.getShape(String.valueOf(i % 3 + 1));
            System.out.println("Shape:" + cloneShape.getType() + ",add:" + cloneShape);
        }

    }
}