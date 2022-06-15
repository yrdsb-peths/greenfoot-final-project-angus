import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Powerleiste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Powerleiste extends Actor
{
    /**
     * Act - do whatever the Powerleiste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    
    public boolean geschossen()
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getGeschossenPower();
    }
    
    public void verschwinden()
    {
        getImage().setTransparency(0);
    }
    
    public void reset()
    {
        getImage().setTransparency(255);
    }
    
}
