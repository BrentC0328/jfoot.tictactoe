package com.github.curriculeon.jfoot;

import greenfoot.Actor;
import greenfoot.Greenfoot;

import java.util.List;

public class Placeholder extends Actor {
    public Placeholder() {
        setImage("cell.jpg");
    }

    @Override
    public void act() {
        List<PlayerPiece> playerPieces = getWorld().getObjects(PlayerPiece.class);
        PlayerPiece playerPieceToAdd = null;
        if (Greenfoot.mouseClicked(this)) {
            if (playerPieces.size() % 2 == 0) {
                playerPieceToAdd = new Cross();
            } else {
                playerPieceToAdd = new Circle();
            }
        }

        if (playerPieceToAdd != null) {
            getWorld().addObject(playerPieceToAdd, getX(), getY());
            getWorld().removeObject(this);
        }
    }
}
