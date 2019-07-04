package cn.zenyatta.learn.designpattern.command;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class CommandTest {

    @Test
    public void testCommandPattern(){
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }

}