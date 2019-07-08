package cn.zenyatta.learn.designpattern.visitor;

/**
 * @author mingming.song
 */
class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
