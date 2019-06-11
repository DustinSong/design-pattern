package cn.zenyatta.learn.designpattern.builder;

/**
 * @author mingming.song
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
