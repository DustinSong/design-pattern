package cn.zenyatta.learn.designpattern.builder;

/**
 * @author mingming.song
 */
abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
