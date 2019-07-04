package cn.zenyatta.learn.designpattern.interpreter;

/**
 * @author mingming.song
 */
interface Expression {
    boolean interpret(String context);
}
