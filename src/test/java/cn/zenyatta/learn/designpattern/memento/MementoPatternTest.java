package cn.zenyatta.learn.designpattern.memento;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class MementoPatternTest {

    @Test
    public void testMemento() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");

        System.out.println("Current state: " + originator.getState());

        originator.getStateFromMemeto(careTaker.get(0));
        System.out.println("First savedState: " + originator.getState());

        originator.getStateFromMemeto(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }

}