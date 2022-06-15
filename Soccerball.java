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
    
    //GreenfootImage idle = new Greenfoot[8];
    
    //public Soccerball()
    //{
        //for(int i = 0; i < idle.length; i++)
        //{
            //idle[i] = new GreenfootImage("images/ball_idle/idle" + i + ".png");
        //}
        //setImage(idle);
    //}
    
    //int imageIndex = 0;
    //public void animateSoccerball()
    //{
        //setImage(idle[imageIndex]);
        //imageIndex = imageIndex + 1 % idle.length
    //}
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation(x + 2, y);
        
        MyWorld world = (MyWorld) getWorld();
        
        
        
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
