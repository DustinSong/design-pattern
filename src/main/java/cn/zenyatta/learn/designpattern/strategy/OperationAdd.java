package cn.zenyatta.learn.designpattern.strategy;

/**
 * @author mingming.song
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
