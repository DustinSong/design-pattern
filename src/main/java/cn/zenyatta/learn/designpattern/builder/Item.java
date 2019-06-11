package cn.zenyatta.learn.designpattern.builder;

import java.math.BigDecimal;

/**
 * @author mingming.song
 */
public interface Item {
    String name();
    Packing packing();
    BigDecimal price();
}
