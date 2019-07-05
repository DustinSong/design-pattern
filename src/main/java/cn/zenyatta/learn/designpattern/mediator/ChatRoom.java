package cn.zenyatta.learn.designpattern.mediator;

import java.util.Date;

/**
 * @author mingming.song
 */
class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()+" ["+user.getName()+" ] :"+message);
    }
}
