import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goalie extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 5, getY()); 
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 5, getY()); 
        }
        if(Greenfoot.isKeyDown("up"))
            setLocation(getX(), getY() - 5); 
        if(Greenfoot.isKeyDown("down"))
            setLocation(getX(), getY() + 5); 
            
        take();
    }
    public void take()
    {
        if(isTouching(Soccerball.class)){
            removeTouching(Soccerball.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnSoccerball();
        }
    }
}
