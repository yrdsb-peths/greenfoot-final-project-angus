import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    private int level; 

    Arrow arrow = new Arrow();
    Powerbar powerbar = new Powerbar();
    PowerBar_Ball powerBar_Ball = new PowerBar_Ball();
    Ball ball = new Ball();
    Goalie goalie = new Goalie();

    Score score = new Score();
    Score_Ball display01 = new Score_Ball();
    Score_Ball display02 = new Score_Ball();
    Score_Ball display11 = new Score_Ball();
    Score_Ball display12 = new Score_Ball();
    Score_Ball display21 = new Score_Ball();
    Score_Ball display22 = new Score_Ball();
    Score_Ball display31 = new Score_Ball();
    Score_Ball display32 = new Score_Ball();
    Score_Ball display41 = new Score_Ball();
    Score_Ball display42 = new Score_Ball();

    
    private GreenfootSound backgroundMusic = new GreenfootSound("Stadion.mp3"); //Quelle: https://www.greenfoot.org/topics/1649    Quelle Sound: http://www.hoerspielbox.de/download-sound/?timestamp=85&title=Stadionatmo%20mit%20jubelenden%20Massen%20und%20Beschallung&cat=Atmosphären%20Stadt%20&permalink=http://www.hoerspielbox.de/im-fussballstadion-vor-anpfiff/&file=1-1-10026.mp3&soundlink=http://archive.hoerspielbox.de/1-1-10026.mp3

    public MyWorld()
    {    
        super(700, 465, 1); 

        addObject(new Himmel(), 350, 400);
        addObject(new Stadium(), 350, 0);
        addObject(new Goal(), 350, 150);

        backgroundMusic.playLoop();

        level = 1;

        addObject(goalie, 350,190);
        addObject(ball, 350, 420);
        addObject(arrow, 350, 355);
        addObject(powerbar, 620, 375);
        addObject(powerBar_Ball, 584, 362);

        //score display
        addObject(score, 130,400);
        addObject(display01, 62,363);
        addObject(display02,64, 421);
        addObject(display11,97,363);
        addObject(display12,99, 421);
        addObject(display21,132,363);
        addObject(display22,134, 421);
        addObject(display31,167,363);
        addObject(display32,169, 421);
        addObject(display41,202,363);
        addObject(display42,204, 421);

    }

    public void displayReset() 
    {
        display01.reset();
        display02.reset();
        display11.reset();
        display12.reset();
        display21.reset();
        display22.reset();
        display31.reset();
        display32.reset();
        display41.reset();
        display42.reset();
    }

    

    public int getDirectionArrow() 
    {
        return arrow.getRotation();

    }

    public boolean getShotArrow()
    {
        return arrow.getShot();
    }

    public double getPower() 
    {
        return powerBar_Ball.getPower();
    }

    public boolean getShotPower() 
    {
        return powerBar_Ball.getGeschossen();
    }

    public boolean startTorwart() 
    {
        return ball.getStart();
    }

    public void powerLeisteEntfernen() 
    {
        powerbar.disappear();
    }

    public boolean getStartTorwart() 
    {
        return goalie.getStart();
    }

    public void toMove() 
    {
        goalie.act2();
    }

    public Actor getTorwart() 
    {
        return goalie.getTorwart();
    }

    public void gehaltenBild() 
    {
        goalie.bildWechsel();
    }

    public void torwartReset() 
    {
        goalie.reset();
    }

    public void arrowReset()  
    {
        arrow.reset();
    }

    public void powerbarReset() 
    {
        powerbar.reset();
    }

    public void powerBarBallReset() 
    {
        powerBar_Ball.reset();
    }

    public void display(int nummer, boolean tor) 
    {
        if(nummer == 1)
        {
            if (tor)
            {
                display01.treffer();
            }
            else
            {
                display01.miss();
            }
        }
        else if (nummer == 2)
        {
            if(tor)
            {
                display02.treffer();
            }
            else
            {
                display02.miss();
            }
        }
        else if (nummer == 11)
        {
            if(tor)
            {
                display11.treffer();
            }
            else
            {
                display11.miss();
            }
        }
        else if (nummer == 12)
        {
            if(tor)
            {
                display12.treffer();
            }
            else
            {
                display12.miss();
            }
        }
        else if (nummer == 21)
        {
            if(tor)
            {
                display21.treffer();
            }
            else
            {
                display21.miss();
            }
        }
        else if (nummer == 22)
        {
            if(tor)
            {
                display22.treffer();
            }
            else
            {
                display22.miss();
            }
        }
        else if (nummer == 31)
        {
            if(tor)
            {
                display31.treffer();
            }
            else
            {
                display31.miss();
            }
        }
        else if (nummer == 32)
        {
            if(tor)
            {
                display32.treffer();
            }
            else
            {
                display32.miss();
            }
        }
        else if (nummer == 41)
        {
            if(tor)
            {
                display41.treffer();
            }
            else
            {
                display41.miss();
            }
        }
        else if (nummer == 42)
        {
            if(tor)
            {
                display42.treffer();
            }
            else
            {
                display42.miss();
            }
        }
    }

}
