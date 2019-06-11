package cn.zenyatta.learn.designpattern.singleton;

/**
 * @author mingming.song
 */
public class SingleObjectLazyInnerClass {
    private static class SingletonHolder {
        private static final SingleObjectLazyInnerClass instance = new SingleObjectLazyInnerClass();
    }

    public static final SingleObjectLazyInnerClass getInstance() {
        return SingletonHolder.instance;
    }

    private SingleObjectLazyInnerClass() {
    }
}
