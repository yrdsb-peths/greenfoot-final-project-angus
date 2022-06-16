    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Goalie extends Actor
{
    private boolean start;

    public Goalie()
    {
        start = false;
        setLocation(350,190);
        setImage("Goalie_1.png");
        this.getImage().scale(75,150);
    }

    public void act() 
    {    

    }
    public void act2() 
    {    
        if(!start)
        {
            parade();

        }

    }

    public boolean geschossen() 
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getShotArrow() && w.getShotPower();
    }

    public void parade()
    {

        int parade = Greenfoot.getRandomNumber(3);
        if (parade == 0)
        {
            pause(1);
        }
        else if(parade == 1)
        {
            for (int i = 0; i< 110; i++)
            {
                setLocation(getX()+1, getY());
                pause(1);
            }
        }
        else if(parade == 2)
        {
            for (int i = 0; i< 110; i++)
            {
                setLocation(getX()-1, getY());
                pause(1);
            }
        }
        start = true;

    }

    public boolean getStart()
    {
        return start;
    }

    public Actor getTorwart()
    {
        return this;
    }


    public void move_right()
    {
        setLocation(getX()+1, getY());
        pause(10);
    }

    public void move_left()
    {       
        setLocation(getX()-1, getY());
        pause(10);
    }

    public void bildWechsel()
    {
        if(getX()> 400)
        {
            setImage("Goalie_Red_Right.png");
            this.getImage().scale(85,170);
        }
        else if (getX()< 300)
        {
            setImage("Goalie_Red_Left.png");
            this.getImage().scale(85,170);
        }
        else
        {
            setImage("Goalie_Red_Middle.png");
            this.getImage().scale(85,170);
        }
    }
    
    public void reset()
    {
        start = false;
        setLocation(350,190);
        setImage("Goalie_1.png");
        this.getImage().scale(75,150);
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
