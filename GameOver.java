import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Game Over Screen.
 * Source of picture: http://mediadb.kicker.de/news/1000/1020/1100/28000/artikel/855742/cr-1468180005_zoom45_crop_800x600_800x600+64+13.jpg
 * Picture Edited with: paint.net
 * @author (Frederic Risling) 
 * @version (1.0)
 */
public class GameOver extends World
{
    public GameOver()
    {    
        super(700, 465, 1); 
        setBackground(new GreenfootImage("Game Over.png"));
        addObject(new Button2(), 500, 350);
    }
}
