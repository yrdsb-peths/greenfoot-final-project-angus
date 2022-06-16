import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pfeil here.
 * Picture: Out of http://www.greenfoot.org/scenarios/7622
 * @author (Frederic Risling) 
 * @version (1.0)
 */
public class Arrow extends Actor
{

    public boolean geschossen;
    public int richtung;
    MyWorld w = (MyWorld) getWorld();
    private int level;

    

    public Arrow()
    {
        geschossen = false;
        level = 1;
    }

    public void act() 
    {
        if(!geschossen)
        {
            rotieren();

        }
        if(geschossen)
        {
            getImage().setTransparency(0);
        }

    }

    public void rotieren()
    {
        for (int i = 0; i<60; i++)
        {
            rotieren_rechts();
            richtung = getRotation();
        }
        for(int i=0;i<120;i++)
        {
            rotieren_links();
            richtung = getRotation();
        }
        for (int i = 0; i<60; i++)
        {
            rotieren_rechts();
            richtung = getRotation();
        }

    }

    public void rotieren_rechts()
    {
        if(Greenfoot.isKeyDown("space")|| geschossen)
        {
            geschossen = true;

        }
        else 
        {
            setRotation(getRotation()+1);
            pause(11-level);

        }

    }

    public void rotieren_links()
    {
        if(Greenfoot.isKeyDown("space")|| geschossen)
        {
            geschossen = true;

        }
        else
        {

            setRotation(getRotation()-1);
            pause(11-level);

        }
    }

    public int getRichtung()
    {

        return richtung;

    }

    public boolean getGeschossen()
    {
        return geschossen;
    }

    public void reset()
    {
        setRotation(0);
        geschossen = false;
        getImage().setTransparency(255);
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
