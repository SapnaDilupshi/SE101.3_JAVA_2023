package com.mycompany.lifegameobj;
public class LifeGameObj
{

    public static void main(String[] args)
    {
        Movements player1 = new RegularPlayer();
        Movements player2 = new OppositePlayer();
        Movements player3 = new JumpingPlayer();

        player1.moveUp();
        player1.moveLeft();
        player2.moveDown();
        player2.moveRight();
        player3.moveUp();
        player3.moveRight();

    }
}
