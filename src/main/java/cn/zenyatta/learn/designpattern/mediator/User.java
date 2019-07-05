package cn.zenyatta.learn.designpattern.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mingming.song
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {
    private String name;

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
