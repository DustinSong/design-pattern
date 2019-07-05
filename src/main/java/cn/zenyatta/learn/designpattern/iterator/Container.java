package cn.zenyatta.learn.designpattern.iterator;

/**
 * @author mingming.song
 */
interface Container<T> {
    Iterator<T> getIterator();
}
