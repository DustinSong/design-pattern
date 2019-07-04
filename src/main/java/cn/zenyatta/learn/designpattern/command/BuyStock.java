package cn.zenyatta.learn.designpattern.command;

/**
 * @author mingming.song
 */
class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
