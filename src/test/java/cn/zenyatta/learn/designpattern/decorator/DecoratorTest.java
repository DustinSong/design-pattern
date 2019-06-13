package cn.zenyatta.learn.designpattern.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator rectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        System.out.println();
        redCircle.draw();
        System.out.println();
        rectangle.draw();
    }

}