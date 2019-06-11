package cn.zenyatta.learn.designpattern.builder;

import java.math.BigDecimal;

/**
 * @author mingming.song
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(25);
    }
}
