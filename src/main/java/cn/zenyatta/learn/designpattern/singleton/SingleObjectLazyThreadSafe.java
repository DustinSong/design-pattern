package cn.zenyatta.learn.designpattern.singleton;

/**
 * @author mingming.song
 */
public class SingleObjectLazyThreadSafe {
    private static SingleObjectLazyThreadSafe instance;

    public static synchronized SingleObjectLazyThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingleObjectLazyThreadSafe();
        }

        return instance;
    }

    private SingleObjectLazyThreadSafe() {
    }
}
