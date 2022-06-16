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
    Score_Ball anzeige01 = new Score_Ball();
    Score_Ball anzeige02 = new Score_Ball();
    Score_Ball anzeige11 = new Score_Ball();
    Score_Ball anzeige12 = new Score_Ball();
    Score_Ball anzeige21 = new Score_Ball();
    Score_Ball anzeige22 = new Score_Ball();
    Score_Ball anzeige31 = new Score_Ball();
    Score_Ball anzeige32 = new Score_Ball();
    Score_Ball anzeige41 = new Score_Ball();
    Score_Ball anzeige42 = new Score_Ball();

    
    private GreenfootSound backgroundMusic = new GreenfootSound("Stadion.mp3"); //Quelle: https://www.greenfoot.org/topics/1649    Quelle Sound: http://www.hoerspielbox.de/download-sound/?timestamp=85&title=Stadionatmo%20mit%20jubelenden%20Massen%20und%20Beschallung&cat=Atmosphären%20Stadt%20&permalink=http://www.hoerspielbox.de/im-fussballstadion-vor-anpfiff/&file=1-1-10026.mp3&soundlink=http://archive.hoerspielbox.de/1-1-10026.mp3

    public MyWorld()
    {    
        // Einstellung der Größe des Fensters.
        super(700, 465, 1); 

        // Hier werden zwei Objekte der Welt hinzugefügt, welche den Hintergrund in Form eines Tores, eines Stadions und eines Himmels darstellen.
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
        addObject(anzeige01, 62,363);
        addObject(anzeige02,64, 421);
        addObject(anzeige11,97,363);
        addObject(anzeige12,99, 421);
        addObject(anzeige21,132,363);
        addObject(anzeige22,134, 421);
        addObject(anzeige31,167,363);
        addObject(anzeige32,169, 421);
        addObject(anzeige41,202,363);
        addObject(anzeige42,204, 421);

    }

    public void anzeigeReset() // Diese Methode stellt die Tor/Fehler Anzeige wieder zurück, bei beginn eines neuen Levels.
    {
        anzeige01.reset();
        anzeige02.reset();
        anzeige11.reset();
        anzeige12.reset();
        anzeige21.reset();
        anzeige22.reset();
        anzeige31.reset();
        anzeige32.reset();
        anzeige41.reset();
        anzeige42.reset();
    }

    

    public int getDirectionArrow() 
    {
        return arrow.getRotation();

    }

    public boolean getShotArrow()
    {
        return arrow.getShot();
    }

    public double getPower() //liefert die Power des Schusses von dem Objekt der Klasse PowerLeiste_Ball.
    {
        return powerBar_Ball.getPower();
    }

    public boolean getShotPower() // gibt true zurück, wenn der Ball der Powerleiste "geschossen" wurde. Also wenn die Leertaste für den Ball der Powerleiste gedrückt wurde.
    {
        return powerBar_Ball.getGeschossen();
    }

    public boolean startTorwart() //liefert dem Objekt der Klasse Torwart, ob der Ball bereits losfliegt.
    {
        return ball.getStart();
    }

    public void powerLeisteEntfernen() // Hierdurch verschwindet die Powerleiste
    {
        powerbar.disappear();
    }

    public boolean getStartTorwart() // gibt zurück ob der Torwart angefangen hat zu parieren.
    {
        return goalie.getStart();
    }

    public void toMove() // Der Torwart bewegt sich.
    {
        goalie.act2();
    }

    public Actor getTorwart() // das Objekt der Klasse Torwart wird zurückgegeben.
    {
        return goalie.getTorwart();
    }

    public void gehaltenBild() // Wenn der Torwart den Ball hält wird das Bild geändert in ein Bild, wo er den Ball hält.
    {
        goalie.bildWechsel();
    }

    public void torwartReset() // Der Torwart wird an die Anfangszustand zurückgessetzt.
    {
        goalie.reset();
    }

    public void arrowReset() // Der Pfeil wird zurückgesetzt in den Anfangszustand.
    {
        arrow.reset();
    }

    public void powerbarReset() // Die Powerleiste wird zurückgesetzt in den Anfangszustand.
    {
        powerbar.reset();
    }

    public void powerBarBallReset() //Der Ball der Powerleiste wird zurückgesetzt in den Anfangszustand.
    {
        powerBar_Ball.reset();
    }

    public void anzeige(int nummer, boolean tor) // Methode stellt die Tor/Fehler Anzeige je nach Fall ein.
    {
        if(nummer == 1)
        {
            if (tor)
            {
                anzeige01.treffer();
            }
            else
            {
                anzeige01.miss();
            }
        }
        else if (nummer == 2)
        {
            if(tor)
            {
                anzeige02.treffer();
            }
            else
            {
                anzeige02.miss();
            }
        }
        else if (nummer == 11)
        {
            if(tor)
            {
                anzeige11.treffer();
            }
            else
            {
                anzeige11.miss();
            }
        }
        else if (nummer == 12)
        {
            if(tor)
            {
                anzeige12.treffer();
            }
            else
            {
                anzeige12.miss();
            }
        }
        else if (nummer == 21)
        {
            if(tor)
            {
                anzeige21.treffer();
            }
            else
            {
                anzeige21.miss();
            }
        }
        else if (nummer == 22)
        {
            if(tor)
            {
                anzeige22.treffer();
            }
            else
            {
                anzeige22.miss();
            }
        }
        else if (nummer == 31)
        {
            if(tor)
            {
                anzeige31.treffer();
            }
            else
            {
                anzeige31.miss();
            }
        }
        else if (nummer == 32)
        {
            if(tor)
            {
                anzeige32.treffer();
            }
            else
            {
                anzeige32.miss();
            }
        }
        else if (nummer == 41)
        {
            if(tor)
            {
                anzeige41.treffer();
            }
            else
            {
                anzeige41.miss();
            }
        }
        else if (nummer == 42)
        {
            if(tor)
            {
                anzeige42.treffer();
            }
            else
            {
                anzeige42.miss();
            }
        }
    }

}
