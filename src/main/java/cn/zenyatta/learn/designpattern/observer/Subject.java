package cn.zenyatta.learn.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingming.song
 */
public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state=state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observerList.add(observer);

    }

    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
