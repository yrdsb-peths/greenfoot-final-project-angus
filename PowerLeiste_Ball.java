import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class PowerLeiste_Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerLeiste_Ball extends Powerleiste
{

    private boolean geschossen;
    private boolean start;
    MyWorld w = (MyWorld) getWorld();
    private int level;

    public PowerLeiste_Ball()
    {

        geschossen = false;
        start = false;
        level = 1;

    }

    public void act() 
    {

        if(getGeschossenPfeil())
        {
            bewegen();
            
        }
        if(geschossen)
        {
            getImage().setTransparency(0);
            powerLeisteEntfernen();
        }
    }

    public boolean getGeschossenPfeil()
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getGeschossenPfeil();

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
            bewegen_rechts();
        }
        for(int i = 0; i<68; i++)
        {
            bewegen_links();
        }

    }

    public void bewegen_rechts()
    {
        if(!start)
        {
            pause(750);
            start = true;
        }
        int i = 0;
        if(!geschossen)
        {
            i = 1;
            geschossen = Greenfoot.isKeyDown("space");
        }
        
        setLocation(getX()+i, getY());
        pause(11-level);
        

    }

    public void bewegen_links()
    {
        int i = 0;
        if(!geschossen)
        {
            i = 1;
            geschossen = Greenfoot.isKeyDown("space");
        }
        setLocation(getX()-i, getY());
        pause(11-level);

    }
    
    

    public double getPower()
    {
        return getX()-584; //bei -584 bekommt man zweistellige Zahlen
    }

    public boolean getGeschossen()
    {
        return geschossen;
    }
    
    public void reset()
    {
        setLocation(584, 362);
        getImage().setTransparency(255);
        geschossen = false;
        start = false;
        
    }
    
    public void setLevel(int newLevel)
    {
        level = newLevel;
    }

    private void pause(int i) //Quelle suchen
    { 
        try {
            Thread.sleep(i);
            getWorld().repaint();
        }
        catch(InterruptedException ie) { }
    }
}
