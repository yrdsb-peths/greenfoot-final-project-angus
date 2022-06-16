import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GameOver extends World
{
    public GameOver()
    {    
        super(700, 465, 1); 
        setBackground(new GreenfootImage("Game Over.png"));
        addObject(new Button2(), 500, 350);
    }
}
