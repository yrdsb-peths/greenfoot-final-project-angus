import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private boolean clicked;
    private boolean musicStart;

    public Button()
    {
        
        clicked = false;
        musicStart = false;
        

    }

    public void act() 
    {
        if(!clicked)
        {
            click();
            
        }
        music();
    }    

    public void click() //https://www.youtube.com/watch?v=EnssnF5cXg0
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
            clicked = true;
        }
        
        
        
    }
    
    public void music()
    {
        if(!musicStart)
        {
            musicStart = true;
            Start w = (Start)getWorld();
            w.music();
            
            
        }
    }
    
   
    
}
