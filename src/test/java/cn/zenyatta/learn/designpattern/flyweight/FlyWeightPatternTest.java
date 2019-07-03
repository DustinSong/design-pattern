package cn.zenyatta.learn.designpattern.flyweight;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class FlyWeightPatternTest {

    private String[] colors;

    @Before
    public void prepare() {
        colors = new String[]{"Red", "Blue", "Green", "White", "Black"};
    }

    @Test
    public void testFlyWeight() {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);

            circle.draw();
        }
    }

    private int getRandomY() {
        return (int) (Math.random() * 100);
    }

    private int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

}