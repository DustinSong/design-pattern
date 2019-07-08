package cn.zenyatta.learn.designpattern.template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mingming.song
 */
public class TemplatePatternTest {

    @Test
    public void testTemplate() {
        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }

}