package cn.zenyatta.learn.designpattern.mediator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class MediatorPatternTest {

    @Test
    public void testMediator() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi John");
        john.sendMessage("Hi Robert");
    }

}