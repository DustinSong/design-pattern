package cn.zenyatta.learn.designpattern.builder;

/**
 * @author mingming.song
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

}
