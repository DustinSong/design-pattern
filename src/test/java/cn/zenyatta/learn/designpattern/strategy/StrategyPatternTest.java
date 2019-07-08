package cn.zenyatta.learn.designpattern.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class StrategyPatternTest {

    @Test
    public void testStrategy() {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}