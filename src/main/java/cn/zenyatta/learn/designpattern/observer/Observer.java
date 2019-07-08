package cn.zenyatta.learn.designpattern.observer;

/**
 * @author mingming.song
 */
abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
