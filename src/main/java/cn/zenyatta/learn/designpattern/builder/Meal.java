package cn.zenyatta.learn.designpattern.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author mingming.song
 */
public class Meal {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public BigDecimal getCost() {
        BigDecimal cost = BigDecimal.ZERO;

        for (Item item : itemList) {
            cost = cost.add(item.price());
        }

        return cost;
    }

    public void showItems() {
        for (Item item : itemList) {
            System.out.println("\nItem: " + item.name());
            System.out.println("Packing: " + item.packing().pack());
            System.out.println("Price: " + item.price());
        }
    }
}
