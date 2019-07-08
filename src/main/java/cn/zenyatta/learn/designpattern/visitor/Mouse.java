package cn.zenyatta.learn.designpattern.visitor;

/**
 * @author mingming.song
 */
class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
