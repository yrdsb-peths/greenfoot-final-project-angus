import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Win extends World
{
    public Win()
    {    
        super(700, 465, 1); 
        setBackground(new GreenfootImage("WIN.jpg"));
        addObject(new Button2(), 600, 100);
    }
}
