package cn.zenyatta.learn.designpattern.iterator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class IteratorPatternTest {

    @Test
    public void testIterator() {
        NameRepository repository = new NameRepository();

        for (Iterator<String> iterator = repository.getIterator(); iterator.hasNext(); ) {
            String name = iterator.next();

            System.out.println("Name: " + name);
        }
    }

}