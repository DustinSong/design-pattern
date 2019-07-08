package cn.zenyatta.learn.designpattern.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mingming.song
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Memento {
    private String state;
}
