import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Powerbar extends Actor
{
    
    public void act() 
    {
        
    }    
    
    public boolean geschossen()
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getShotPower();
    }
    
    public void disappear()
    {
        getImage().setTransparency(0);
    }
    
    public void reset()
    {
        getImage().setTransparency(255);
    }
    
}
