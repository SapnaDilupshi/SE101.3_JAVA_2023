package com.mycompany.lifegameobj;
public class JumpingPlayer extends Movements
{
     @Override
    void moveUp() 
    {
        System.out.println("Jumping player moved up by 5 spaces");
    }

    @Override
    void moveDown() 
    {
        System.out.println("Jumping player moved down by 5 spaces");
    }

    @Override
    void moveLeft() 
    {
        System.out.println("Jumping player moved left by 5 spaces");
    }

    @Override
    void moveRight()
    {
        System.out.println("Jumping player moved right by 5 spaces");
    }
}
