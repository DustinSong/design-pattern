package cn.zenyatta.learn.designpattern.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class ProxyPatternTest {

    @Test
    public void testProxy() {
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
        System.out.println();
        image.display();
    }

}