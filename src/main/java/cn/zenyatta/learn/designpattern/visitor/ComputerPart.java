package cn.zenyatta.learn.designpattern.visitor;

/**
 * @author mingming.song
 */
interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
