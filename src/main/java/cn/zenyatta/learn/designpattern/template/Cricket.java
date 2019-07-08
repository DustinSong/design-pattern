package cn.zenyatta.learn.designpattern.template;

/**
 * @author mingming.song
 */
class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the Game");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
