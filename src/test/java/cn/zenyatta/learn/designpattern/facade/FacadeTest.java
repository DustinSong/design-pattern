package cn.zenyatta.learn.designpattern.facade;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class FacadeTest {

    @Test
    public void testShapeMaker() {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}