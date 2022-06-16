import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PowerBar_Ball extends Powerbar
{

    private boolean shot;
    private boolean start;
    MyWorld w = (MyWorld) getWorld();
    private int level;

    public PowerBar_Ball()
    {

        shot = false;
        start = false;
        level = 1;

    }

    public void act() 
    {

        if(getShotArrow())
        {
            bewegen();
            
        }
        if(shot)
        {
            getImage().setTransparency(0);
            powerLeisteEntfernen();
        }
    }

    public boolean getShotArrow()
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getShotArrow();

    }
    
    public void powerLeisteEntfernen()
    {
        MyWorld w = (MyWorld) getWorld();
        w.powerLeisteEntfernen();
        
    }

    public void bewegen()
    {

        for(int i = 0; i<68; i++)
        {
            move_right();
        }
        for(int i = 0; i<68; i++)
        {
            move_left();
        }

    }

    public void move_right()
    {
        if(!start)
        {
            pause(750);
            start = true;
        }
        int i = 0;
        if(!shot)
        {
            i = 1;
            shot = Greenfoot.isKeyDown("space");
        }
        
        setLocation(getX()+i, getY());
        pause(11-level);
        

    }

    public void move_left()
    {
        int i = 0;
        if(!shot)
        {
            i = 1;
            shot = Greenfoot.isKeyDown("space");
        }
        setLocation(getX()-i, getY());
        pause(11-level);

    }
    
    

    public double getPower()
    {
        return getX()-584; 
    }

    public boolean getGeschossen()
    {
        return shot;
    }
    
    public void reset()
    {
        setLocation(584, 362);
        getImage().setTransparency(255);
        shot = false;
        start = false;
        
    }
    
    public void setLevel(int newLevel)
    {
        level = newLevel;
    }

    private void pause(int i) 
    { 
        try {
            Thread.sleep(i);
            getWorld().repaint();
        }
        catch(InterruptedException ie) { }
    }
}
