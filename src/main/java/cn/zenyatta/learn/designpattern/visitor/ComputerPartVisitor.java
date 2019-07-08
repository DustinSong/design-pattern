package cn.zenyatta.learn.designpattern.visitor;

/**
 * @author mingming.song
 */
interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
