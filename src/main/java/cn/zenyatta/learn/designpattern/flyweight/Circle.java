package cn.zenyatta.learn.designpattern.flyweight;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mingming.song
 */
@Getter
@Setter
@ToString
class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw(). " + this.toString());
    }
}
