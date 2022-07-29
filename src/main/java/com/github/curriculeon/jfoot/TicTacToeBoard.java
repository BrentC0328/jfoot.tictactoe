package com.github.curriculeon.jfoot;

import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Arrays;
import java.util.List;

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
        for (int xPosition = 0; xPosition < getWidth(); xPosition++) {
            for (int yPosition = 0; yPosition < getHeight(); yPosition++) {
                addObject(new Placeholder(), xPosition, yPosition);
            }
        }
    }

    public Boolean isWinningDiagonallyTopRight(PlayerPiece pieceToEvaluate) {
        PlayerPiece piece0301 = getObjectsAt(3, 1, PlayerPiece.class).get(0);
        PlayerPiece piece0202 = getObjectsAt(2, 2, PlayerPiece.class).get(0);
        PlayerPiece piece0103 = getObjectsAt(1, 3, PlayerPiece.class).get(0);
        List<PlayerPiece> pieces = Arrays.asList(piece0301, piece0202, piece0103);
        for(PlayerPiece piece : pieces) {
            Class<?> actualClass = piece.getClass();
            Class<?> expectedClass = pieceToEvaluate.getClass();
            if(!actualClass.equals(expectedClass)) {
                return false;
            }
        }
        return true;
    }

    public Boolean isWinningDiagonallyTopLeft(PlayerPiece piece) {
        return null;
    }

    public Boolean isWinningTopRow(PlayerPiece piece) {
        return null;
    }

    public Boolean isWinningMiddleRow(PlayerPiece piece) {
        return null;
    }

    public Boolean isWinningBottomRow(PlayerPiece piece) {
        return null;
    }

    public Boolean isWinningLeftColumn(PlayerPiece piece) {
        return null;
    }

    public Boolean isWinningMiddleColumn(PlayerPiece playerPiece) {
        return false;
    }

    public Boolean isWinningRightColumn(PlayerPiece piece) {
        return null;
    }

    public Boolean isWinning(PlayerPiece playerPiece) {
        return isWinningTopRow(playerPiece) ||
                isWinningBottomRow(playerPiece) ||
                isWinningMiddleRow(playerPiece) ||
                isWinningDiagonallyTopLeft(playerPiece) ||
                isWinningDiagonallyTopRight(playerPiece) ||
                isWinningRightColumn(playerPiece) ||
                isWinningMiddleColumn(playerPiece) ||
                isWinningLeftColumn(playerPiece);
    }

    @Override
    public void act() {
        List<PlayerPiece> pieces = getObjects(PlayerPiece.class);
        for(PlayerPiece piece : pieces) {
            if(isWinning(piece)) {
                // TODO display winner
            }
        }
    }
}