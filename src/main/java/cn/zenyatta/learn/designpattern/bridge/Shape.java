package cn.zenyatta.learn.designpattern.bridge;

/**
 * @author mingming.song
 */
abstract class Shape {
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
