import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Soccerball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Soccerball extends Actor
{
    /**
     * Act - do whatever the Soccerball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

     public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation(x, y+2);
        
        MyWorld world = (MyWorld) getWorld();
        
        if(getX() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
