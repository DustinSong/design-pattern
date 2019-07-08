package cn.zenyatta.learn.designpattern.observer;

/**
 * @author mingming.song
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
