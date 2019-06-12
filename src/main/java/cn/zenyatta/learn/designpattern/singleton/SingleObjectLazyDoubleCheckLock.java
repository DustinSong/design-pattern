package cn.zenyatta.learn.designpattern.singleton;

/**
 * @author mingming.song
 */
class SingleObjectLazyDoubleCheckLock {
    private static volatile SingleObjectLazyDoubleCheckLock instance;

    public static SingleObjectLazyDoubleCheckLock getInstance() {
        if (instance == null) {
            synchronized (SingleObjectLazyDoubleCheckLock.class) {
                if (instance == null) {
                    instance = new SingleObjectLazyDoubleCheckLock();
                }
            }
        }

        return instance;
    }

    private SingleObjectLazyDoubleCheckLock() {
    }
}
