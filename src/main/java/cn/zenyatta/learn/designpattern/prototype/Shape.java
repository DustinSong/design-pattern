package cn.zenyatta.learn.designpattern.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * @author mingming.song
 */
@Getter
@Setter
abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("unsupported");
        }
        return null;
    }
}
