package com.mycompany.lifegameobj;
public class OppositePlayer extends Movements
{
    @Override
    void moveUp() {
        System.out.println("Opposite player moved down");
    }

    @Override
    void moveDown() {
        System.out.println("Opposite player moved up");
    }

    @Override
    void moveLeft() {
        System.out.println("Opposite player moved right");
    }

    @Override
    void moveRight() {
        System.out.println("Opposite player moved left");
    }

}
