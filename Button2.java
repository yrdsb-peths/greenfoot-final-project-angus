import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Button2 extends Button
{
    
    public void act() 
    {
        click();
    } 
    
    public void click() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
            
        }
        
        
        
    }
}
