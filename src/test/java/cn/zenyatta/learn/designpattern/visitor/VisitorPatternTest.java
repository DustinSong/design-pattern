package cn.zenyatta.learn.designpattern.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class VisitorPatternTest {

    @Test
    public void testVisitor() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}