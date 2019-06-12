package cn.zenyatta.learn.designpattern.singleton;

/**
 * @author mingming.song
 */
class SingleObjectLazyThreadUnsafe {

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
