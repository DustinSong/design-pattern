package cn.zenyatta.learn.designpattern.command;

/**
 * @author mingming.song
 */
class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("[Name: " + name + ",Quantity: " + quantity + "]bought");
    }

    public void sell() {
        System.out.println("[Name: " + name + ",Quantity: " + quantity + "]sold");
    }
}
