import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    private int level; 

    Pfeil pfeil = new Pfeil();
    Powerleiste powerleiste = new Powerleiste();
    PowerLeiste_Ball powerLeiste_Ball = new PowerLeiste_Ball();
    Ball ball = new Ball();
    Torwart torwart = new Torwart();

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

    // Dieses Objekt zeigt das aktuelle Level an.
    LevelAnzeige levelAnzeige = new LevelAnzeige();

    // Hier wird die Hintergrundmusik in einer Variable deklariert und initialisiert.
    private GreenfootSound backgroundMusic = new GreenfootSound("Stadion.mp3"); //Quelle: https://www.greenfoot.org/topics/1649    Quelle Sound: http://www.hoerspielbox.de/download-sound/?timestamp=85&title=Stadionatmo%20mit%20jubelenden%20Massen%20und%20Beschallung&cat=Atmosphären%20Stadt%20&permalink=http://www.hoerspielbox.de/im-fussballstadion-vor-anpfiff/&file=1-1-10026.mp3&soundlink=http://archive.hoerspielbox.de/1-1-10026.mp3

    public MyWorld()
    {    
        // Einstellung der Größe des Fensters.
        super(700, 465, 1); 

        // Hier werden zwei Objekte der Welt hinzugefügt, welche den Hintergrund in Form eines Tores, eines Stadions und eines Himmels darstellen.
        addObject(new Himmel(), 350, 400);
        addObject(new Stadium(), 350, 0);
        addObject(new Tor(), 350, 150);

        // Hier wird festgelegt, dass die Hintergrundmusik durchgehend gespielt werden soll.
        backgroundMusic.playLoop();

        // Das Level wird mit 1 initialisiert.
        level = 1;

        // Hier werden die Objekte, die für einen Schuss miteinander interagieren müssen, der Welt hinzugefügt.
        addObject(torwart, 350,190);
        addObject(ball, 350, 420);
        addObject(pfeil, 350, 355);
        addObject(powerleiste, 620, 375);
        addObject(powerLeiste_Ball, 584, 362);

        //Scoreanzeige
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

        //Levelanzeige
        addObject(levelAnzeige, 625, 190);
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

    public int getLevel() // gibt das aktuelle Level zurück.
    {
        return level;
    }

    public void setLevelAnzeige() // ändert die Anzeige des Levels auf das aktuelle Level.
    {
        levelAnzeige.bildwechsel(level);
    }

    public void levelErhöhen() // Erhöht das Level um 1 und öffnet bei Gewinn des Spiels den Win-Screen
    {
        level++;  
        if(level==11)
        {
            Greenfoot.setWorld(new Win());
        }
    }

    public void setLevelPP() // Hier werden bei den Objekten der Klassen Pfeil und PowerLeiste_Ball die Level auf das aktuelle aktualisiert.
    {
        pfeil.setLevel(level);
        powerLeiste_Ball.setLevel(level);
    }

    public int getRichtungPfeil() 
    {
        return pfeil.getRichtung();

    }

    public boolean getGeschossenPfeil()
    {
        return pfeil.getGeschossen();
    }

    public double getPower() //liefert die Power des Schusses von dem Objekt der Klasse PowerLeiste_Ball.
    {
        return powerLeiste_Ball.getPower();
    }

    public boolean getGeschossenPower() // gibt true zurück, wenn der Ball der Powerleiste "geschossen" wurde. Also wenn die Leertaste für den Ball der Powerleiste gedrückt wurde.
    {
        return powerLeiste_Ball.getGeschossen();
    }

    public boolean startTorwart() //liefert dem Objekt der Klasse Torwart, ob der Ball bereits losfliegt.
    {
        return ball.getStart();
    }

    public void powerLeisteEntfernen() // Hierdurch verschwindet die Powerleiste
    {
        powerleiste.verschwinden();
    }

    public boolean getStartTorwart() // gibt zurück ob der Torwart angefangen hat zu parieren.
    {
        return torwart.getStart();
    }

    public void twBewegen() // Der Torwart bewegt sich.
    {
        torwart.act2();
    }

    public Actor getTorwart() // das Objekt der Klasse Torwart wird zurückgegeben.
    {
        return torwart.getTorwart();
    }

    public void gehaltenBild() // Wenn der Torwart den Ball hält wird das Bild geändert in ein Bild, wo er den Ball hält.
    {
        torwart.bildWechsel();
    }

    public void torwartReset() // Der Torwart wird an die Anfangszustand zurückgessetzt.
    {
        torwart.reset();
    }

    public void pfeilReset() // Der Pfeil wird zurückgesetzt in den Anfangszustand.
    {
        pfeil.reset();
    }

    public void powerleisteReset() // Die Powerleiste wird zurückgesetzt in den Anfangszustand.
    {
        powerleiste.reset();
    }

    public void powerLeisteBallReset() //Der Ball der Powerleiste wird zurückgesetzt in den Anfangszustand.
    {
        powerLeiste_Ball.reset();
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
                anzeige01.fehlschuss();
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
                anzeige02.fehlschuss();
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
                anzeige11.fehlschuss();
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
                anzeige12.fehlschuss();
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
                anzeige21.fehlschuss();
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
                anzeige22.fehlschuss();
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
                anzeige31.fehlschuss();
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
                anzeige32.fehlschuss();
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
                anzeige41.fehlschuss();
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
                anzeige42.fehlschuss();
            }
        }
    }

}
