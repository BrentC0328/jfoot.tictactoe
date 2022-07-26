package com.github.curriculeon.jfoot;

import com.github.git_leon.jfoot.resources.JFootTextImage;
import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

/**
 * A world where wombats live.
 *
 * @author Michael Kölling
 * @version 2.0
 */
public class TicTacToeBoard extends World {
    /**
     * Create a new world with 3x3 cells and
     * with a cell size of 60x60 pixels.
     */
    public TicTacToeBoard() {
        super(3, 3, 60);
        setBackground("cell.jpg");
        setPaintOrder(Circle.class, Cross.class, Placeholder.class);
        populate();
    }

    public void populate() {
        for(int xPosition=0; xPosition < getWidth(); xPosition++) {
            for(int yPosition=0; yPosition < getHeight(); yPosition++) {
                addObject(new Placeholder(), xPosition, yPosition);
            }
        }
    }

    @Override
    public void act() {
    }
}