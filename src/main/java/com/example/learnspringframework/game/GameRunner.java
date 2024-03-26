package com.example.learnspringframework.game;

public class GameRunner {
    private GamingConsole game;
//    SuperContra game;
//    MarioGame game;
    public GameRunner(GamingConsole game) {
            this.game=game;
    }

    public void run() {
        System.out.println(game+" is running");
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
