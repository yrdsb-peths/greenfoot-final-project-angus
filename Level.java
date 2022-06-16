import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelAnzeige here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor
{
    /**
     * Act - do whatever the LevelAnzeige wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void picture(int level)
    {
        if (level == 1)
        {
            setImage("Level_1.png");
        }
        else if (level == 2)
        {
            setImage("Level_2.png");
        }
        else if (level == 3)
        {
            setImage("Level_3.png");
        }
    }
    
}
