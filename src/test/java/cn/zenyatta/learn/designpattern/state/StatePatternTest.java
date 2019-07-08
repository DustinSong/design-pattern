package cn.zenyatta.learn.designpattern.state;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class StatePatternTest {

    @Test
    public void testState() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }

}