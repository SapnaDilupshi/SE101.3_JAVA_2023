package com.mycompany.lifegameobj;
public class RegularPlayer extends Movements
{
    @Override
    void moveUp() {
        System.out.println("Regular player moved up");
    }

    @Override
    void moveDown() {
        System.out.println("Regular player moved down");
    }

    @Override
    void moveLeft() {
        System.out.println("Regular player moved left");
    }

    @Override
    void moveRight() {
        System.out.println("Regular player moved right");
    }

}
