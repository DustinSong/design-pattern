package cn.zenyatta.learn.designpattern.memento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mingming.song
 */
@Setter
@Getter
@ToString
public class Originator {
    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemeto(Memento memento) {
        state = memento.getState();
    }
}
