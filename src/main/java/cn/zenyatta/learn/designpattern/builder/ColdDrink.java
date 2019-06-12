package cn.zenyatta.learn.designpattern.builder;

/**
 * @author mingming.song
 */
abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

}
