package com.github.curriculeon.jfoot;

import com.github.git_leon.jfoot.resources.JFootTextImage;
import greenfoot.Actor;
import greenfoot.Color;

public class PlayerPiece extends Actor {
    public PlayerPiece(String symbol, Color color) {
        setImage(new JFootTextImage(symbol, 50, color));
    }
}
