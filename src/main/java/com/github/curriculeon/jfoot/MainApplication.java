package com.github.curriculeon.jfoot;

import com.github.git_leon.jfoot.system.JFootApplication;
import greenfoot.Greenfoot;
import greenfoot.core.WorldHandler;

/**
 * @author leonhunter
 * @created 04/03/2020 - 3:59 PM
 */
public class MainApplication {
    public static void main(String[] args) {
        new JFootApplication().run();
        TicTacToeBoard world = new TicTacToeBoard();
        WorldHandler.getInstance().getWorld();
        Greenfoot.setWorld(world);
        Greenfoot.setSpeed(25);
        world.populate();
    }
}
