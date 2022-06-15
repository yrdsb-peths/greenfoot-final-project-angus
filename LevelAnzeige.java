import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelAnzeige here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelAnzeige extends Actor
{
    /**
     * Act - do whatever the LevelAnzeige wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void bildwechsel(int level)
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
        else if (level == 4)
        {
            setImage("Level_4.png");
        }
        else if (level == 5)
        {
            setImage("Level_5.png");
        }
        else if (level == 6)
        {
            setImage("Level_6.png");
        }
        else if (level == 7)
        {
            setImage("Level_7.png");
        }
        else if (level == 8)
        {
            setImage("Level_8.png");
        }
        else if (level == 9)
        {
            setImage("Level_9.png");
        }
        else if (level == 10)
        {
            setImage("Level_10.png");
        }
    }
    
}
