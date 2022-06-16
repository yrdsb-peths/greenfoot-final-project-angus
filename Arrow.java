import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Arrow extends Actor
{

    public boolean shot;
    public int direction;
    MyWorld w = (MyWorld) getWorld();
    private int level;


    public Arrow()
    {
        shot = false;
        level = 1;
    }

    public void act() 
    {
        if(!shot)
        {
            rotate();

        }
        if(shot)
        {
            getImage().setTransparency(0);
        }

    }

    public void rotate()
    {
        for (int i = 0; i<60; i++)
        {
            rotate_right();
            direction = getRotation();
        }
        for(int i=0;i<120;i++)
        {
            rotate_left();
            direction = getRotation();
        }
        for (int i = 0; i<60; i++)
        {
            rotate_right();
            direction = getRotation();
        }

    }

    public void rotate_right()
    {
        if(Greenfoot.isKeyDown("space")|| shot)
        {
            shot = true;

        }
        else 
        {
            setRotation(getRotation()+1);
            pause(11-level);

        }

    }

    public void rotate_left()
    {
        if(Greenfoot.isKeyDown("space")|| shot)
        {
            shot = true;

        }
        else
        {

            setRotation(getRotation()-1);
            pause(11-level);

        }
    }

    public int getDirection()
    {

        return direction;

    }

    public boolean getShot()
    {
        return shot;
    }

    public void reset()
    {
        setRotation(0);
        shot = false;
        getImage().setTransparency(255);
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
