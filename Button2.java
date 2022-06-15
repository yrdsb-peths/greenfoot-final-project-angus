import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button2 extends Button
{
    
    public void act() 
    {
        click();
    } 
    
    public void click() //https://www.youtube.com/watch?v=EnssnF5cXg0
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
            
        }
        
        
        
    }
}
