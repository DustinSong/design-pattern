package cn.zenyatta.learn.designpattern.state;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mingming.song
 */
@Getter
@Setter
@ToString
class Context {
    private State state;

}
