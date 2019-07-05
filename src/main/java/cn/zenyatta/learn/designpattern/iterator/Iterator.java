package cn.zenyatta.learn.designpattern.iterator;

/**
 * @author mingming.song
 */
interface Iterator<T> {
    boolean hasNext();
    T next();
}
