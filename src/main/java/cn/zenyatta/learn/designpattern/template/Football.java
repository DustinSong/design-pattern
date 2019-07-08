package cn.zenyatta.learn.designpattern.template;

/**
 * @author mingming.song
 */
class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the Game");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
