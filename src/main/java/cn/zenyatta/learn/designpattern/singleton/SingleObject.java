package cn.zenyatta.learn.designpattern.singleton;

/**
 * @author mingming.song
 */
public class SingleObject {
    private static SingleObject instance= new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
