package cn.zenyatta.learn.designpattern.singleton;

/**
 * @author mingming.song
 */
public class SingleObjectLazyThreadUnsafe {

    private static SingleObjectLazyThreadUnsafe instance;

    public static SingleObjectLazyThreadUnsafe getInstance() {
        if (instance == null) {
            instance = new SingleObjectLazyThreadUnsafe();
        }

        return instance;
    }

    private SingleObjectLazyThreadUnsafe() {
    }
}
