package cn.zenyatta.learn.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingming.song
 */
class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
