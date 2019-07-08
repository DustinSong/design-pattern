package cn.zenyatta.learn.designpattern.visitor;

/**
 * @author mingming.song
 */
class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
