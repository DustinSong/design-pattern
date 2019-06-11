package cn.zenyatta.learn.designpattern.builder;

import java.math.BigDecimal;

/**
 * @author mingming.song
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(30);
    }
}
