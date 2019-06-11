package cn.zenyatta.learn.designpattern.builder;

import java.math.BigDecimal;

/**
 * @author mingming.song
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(50.5);
    }
}
