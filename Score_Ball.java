
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score_Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score_Ball extends Score
{
    public Score_Ball()
    {
        this.getImage().scale(31,31);
        getImage().setTransparency(0);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void treffer()
    {
        setImage("Ball_gruen.png");
        this.getImage().scale(31,31);
        getImage().setTransparency(255);
    }
    
    public void fehlschuss()
    {
        setImage("Ball_rot.png");
        this.getImage().scale(31,31);
        getImage().setTransparency(255);
    }
    
    public void reset()
    {
        getImage().setTransparency(0);
    }
}
