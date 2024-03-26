package com.example.learnspringframework;

import com.example.learnspringframework.game.GameRunner;
import com.example.learnspringframework.game.MarioGame;
import com.example.learnspringframework.game.Pacman;
import com.example.learnspringframework.game.SuperContra;

public class AppGamingBasicJava {
    public static void main(String[] args){
//        var game=new SuperContra();
//        var marioGame=new MarioGame();
        var game=new Pacman();
        var gameRunner=new GameRunner(game);
        gameRunner.run();

    }
}
