package com.example.learnspringframework.game;

public class Pacman implements GamingConsole{
    public void up(){
        System.out.println("jump pacman");
    }
    public void down(){
        System.out.println("go into hole pacman");
    }
    public void left(){
        System.out.println("go back pacman");
    }
    public void right(){
        System.out.println("accelerate pacman");
    }
}
