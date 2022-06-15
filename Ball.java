import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Class Ball. The most important one in this Game
 * Source of Picture: https://pixabay.com/p-157931/?no_redirect
 * Edited with: paint.net
 * @author (Frederic Risling) 
 * @version (1.0)
 */
public class Ball extends Actor
{
    // zeigt ob der Ball sich schon bewegt
    private boolean start; 

    // zeigt, ob der Torwart den Ball gehalten hat.
    private boolean gehalten; 

    // zeigt ob der Schuss abgeschlossen ist.
    private boolean schussFertig;

    // zeigt ob aus dem Schuss ein Tor geworden ist.
    private boolean tor; 

    // zeigt die Anzahl an Treffern in dem jeweiligen Level an.
    private int anzahlGetroffen; 

    // zeigt die Anzahl an Fehlschüssen in dem jeweiligen Level an.
    private int anzahlVerschossen;

    // zeigt, der wievielte Schuss es in dem jeweiligen Level ist an.
    private int schussNr;

    // speichert die X-Koordinate eines Objektes als double.
    private double exactX;

    //speichert die Y-Koordinate eines Objektes als double.
    private double exactY;

    // Speichert in dem Objekt w der Klasse MyWorld die aktuelle Welt, damit auf deren Methoden zugegriffen werden kann.
    MyWorld w = (MyWorld) getWorld();

    public Ball() //Konstruktor erzeugt ein Objekt der Klasse Ball mit dem Anfangszustand.
    {
        start = false;
        setImage("Ball.png");
        this.getImage().scale(57,56);
        schussNr= 0;
        anzahlGetroffen= 0;
        anzahlVerschossen= 0;

    }

    public void act() 
    {

        if(geschossen()) // wird nur ausgeführt wenn Pfeil und der Ball der Powerleiste mit der Leertaste benutzt worden sind.
        {
            if(!start) //Dient als Abbruchbedingung damit der Ball nur einmal pro Schuss geschossen wird.
            {

                schiessen(getRichtung(), getPower());

            }
        }

    }    

    public void twBewegen() // Hiermit wird letzendlich der Torwart dazu gebracht sich zu bewegen.
    {
        MyWorld w = (MyWorld) getWorld();
        w.twBewegen();
    }

    public Actor getTorwart() // Der Torwart wird zurückgegeben.
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getTorwart();
    }

    public boolean geschossen() // gibt zurück ob sowohl Pfeil als auch der Ball der Powerleiste "geschossen" wurden. Also ob bei beiden die Leertaste gedrückt worden ist.
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getGeschossenPfeil() && w.getGeschossenPower();
    }

    public int getRichtung() // gibt Pfeilrichtung zurück -> in welche Richtung geschossen wird
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getRichtungPfeil();
    }

    public double getPower() // gibt Power zurück -> wie hoch geschossen wird
    {
        MyWorld w = (MyWorld) getWorld();
        return w.getPower();
    }

    public boolean getStart() // gibt zurück ob der Ball sich schon bewegt
    {
        return start;
    }

    /** Die elementarste Methode für dieses Spiel.
     * Ball wird in die durch die Parameter Richtung und Power vorgegebene Richtung bewegt.
     * 
     * Es wird zunächst nach der Power unterschieden und danach nach der Richtung.
     * Diese Methode ist durch längeres ausprobieren und "rumbasteln" entstanden.
     */
    public void schiessen(int richtung, double power)
    {        
        start = true; 
        twBewegen();
        setRotation(richtung-90); // Damit der Ball sich in die gewünschte Richtung bewegt ist es nötig die richtung -90 zu rechnen.
        if(power<=20)
        {
            if(richtung>=340 || richtung<=20)
            {
                double p = power*1.7;
                for(int i = 0; i<p+190; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung<340 && richtung>320)
            {
                double p = power*1.5;
                for(int i = 0; i<p+220; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung>20 && richtung<=40)
            {
                double p = power*1.5;
                for(int i = 0; i<p+220; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung<=320 && richtung>300)
            {
                double p = power*1.7;
                for(int i = 0; i<p+290; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }

            }
            else if(richtung>40 && richtung<=60)
            {
                double p = power*1.7;
                for(int i = 0; i<p+290; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if (richtung<=300 && richtung>250)
            {
                double p = power*2;
                for(int i = 0; i<p+500; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if (richtung>60 && richtung<=110)
            {
                double p = power*2;
                for(int i = 0; i<p+500; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
        }
        else if (power>20 && power<=40)
        {
            if(richtung>=340 || richtung<=20)
            {
                double p = power*2;
                for(int i = 0; i<p+250; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung<340 && richtung>320)
            {
                double p = power*2;
                for(int i = 0; i<p+270; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung>20 && richtung<=40)
            {
                double p = power*2;
                for(int i = 0; i<p+270; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung<=320 && richtung>300)
            {
                double p = power*2.3;
                for(int i = 0; i<p+300; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }

            }
            else if(richtung>40 && richtung<=60)
            {
                double p = power*2.3;
                for(int i = 0; i<p+300; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if (richtung<=300 && richtung>250)
            {
                double p = power*2;
                for(int i = 0; i<p+500; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if (richtung>60 && richtung<=110)
            {
                double p = power*2;
                for(int i = 0; i<p+500; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }

        }
        else if(power>40 && power<=60)
        {
            if(richtung>=340 || richtung<=20)
            {
                double p = power*1.7;
                for(int i = 0; i<p+300; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung<340 && richtung>320)
            {
                double p = power*1.5;
                for(int i = 0; i<p+320; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung>20 && richtung<=40)
            {
                double p = power*1.5;
                for(int i = 0; i<p+320; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung<=320 && richtung>300)
            {
                double p = power*1.7;
                for(int i = 0; i<p+350; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }

            }
            else if(richtung>40 && richtung<=60)
            {
                double p = power*1.7;
                for(int i = 0; i<p+350; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if (richtung<=300 && richtung>250)
            {
                double p = power*2;
                for(int i = 0; i<p+500; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if (richtung>60 && richtung<=110)
            {
                double p = power*2;
                for(int i = 0; i<p+500; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
        }
        else if (power>60)
        {
            if(richtung>=340 || richtung<=20)
            {
                double p = power*1.7;
                for(int i = 0; i<p+350; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung<340 && richtung>320)
            {
                double p = power*1.5;
                for(int i = 0; i<p+370; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung>20 && richtung<=40)
            {
                double p = power*1.5;
                for(int i = 0; i<p+370; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if(richtung<=320 && richtung>300)
            {
                double p = power*1.7;
                for(int i = 0; i<p+400; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }

            }
            else if(richtung>40 && richtung<=60)
            {
                double p = power*1.7;
                for(int i = 0; i<p+400; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if (richtung<=300 && richtung>250)
            {
                double p = power*2;
                for(int i = 0; i<p+500; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
            else if (richtung>60 && richtung<=110)
            {
                double p = power*2;
                for(int i = 0; i<p+500; i++)
                {
                    if(!schussFertig && !gehalten)
                    {
                        move(1);
                        pause(1);
                        groeße();
                        faerben();

                    }   
                }
            }
        }

        schussFertig = true; 
        faerben();
        if(tor)
        {
            Greenfoot.playSound("Jubel.mp3");
        }
        else
        {
            Greenfoot.playSound("Verschossen.mp3");
            anzahlVerschossen++;

        }
        schussNr++;
        pause(1000);
        reset();
        if(anzahlGetroffen==3)
        {
            resetLevel();
            w.levelErhöhen();
            w.setLevelPP();
            w.setLevelAnzeige();
        }
        else if (anzahlVerschossen==3)
        {
            Greenfoot.setWorld(new GameOver());

        }
    }

    public void faerben()
    {
        MyWorld w = (MyWorld) getWorld();
        if(getX()< 145 || getX()> 555 || getY()<57)
        {  
            // getImage().setTransparency(0); //https://www.greenfoot.org/topics/2002
            setImage("Ball_rot.png");
            this.getImage().scale(33,33);
            schussFertig= true;

            if(schussNr==0)
            {
                w.anzeige(1, true);
                w.anzeige(2, false);

            }
            else if (schussNr==1)
            {
                w.anzeige(11, true);
                w.anzeige(12, false);

            }
            else if (schussNr==2)
            {
                w.anzeige(21, true);
                w.anzeige(22, false);

            }
            else if (schussNr==3)
            {
                w.anzeige(31, true);
                w.anzeige(32, false);

            }
            else if(schussNr ==4)
            {
                w.anzeige(41, true);
                w.anzeige(42, false);

            }
            pause(200);
        }
        else if (getY()<270 && schussFertig && !intersects(getTorwart()))
        {
            setImage("Ball_gruen.png");
            this.getImage().scale(33,33);
            tor = true;
            anzahlGetroffen++;
            if(schussNr==0)
            {
                w.anzeige(1, false);
                w.anzeige(2, true);
                // w.addObject(new Fehlschuss(), 62,363);
                // w.addObject(new Treffer(), 64, 421);
            }
            else if (schussNr==1)
            {
                w.anzeige(11, false);
                w.anzeige(12, true);
                // w.addObject(new Fehlschuss(), 97,363);
                // w.addObject(new Treffer(), 99, 421);
            }
            else if (schussNr==2)
            {
                w.anzeige(21, false);
                w.anzeige(22, true);
                // w.addObject(new Fehlschuss(), 132,363);
                // w.addObject(new Treffer(), 134, 421);

            }
            else if (schussNr==3)
            {
                w.anzeige(31, false);
                w.anzeige(32, true);
                // w.addObject(new Fehlschuss(), 167,363);
                // w.addObject(new Treffer(), 169, 421);

            }
            else if(schussNr ==4)
            {
                w.anzeige(41, false);
                w.anzeige(42, true);
                // w.addObject(new Fehlschuss(), 202,363);
                // w.addObject(new Treffer(), 204, 421);
            }
            pause(200);
        }
        else if (intersects(getTorwart()))
        {
            getImage().setTransparency(0);
            this.getImage().scale(33,33);
            gehalten = true;

            w.gehaltenBild();
            if(schussNr==0)
            {
                w.anzeige(1, true);
                w.anzeige(2, false);
                // w.addObject(new Treffer(), 62,363);
                // w.addObject(new Fehlschuss(), 64, 421);
            }
            else if (schussNr==1)
            {
                w.anzeige(11, true);
                w.anzeige(12, false);
                // w.addObject(new Treffer(), 97,363);
                // w.addObject(new Fehlschuss(), 99, 421);
            }
            else if (schussNr==2)
            {
                w.anzeige(21, true);
                w.anzeige(22, false);
                // w.addObject(new Treffer(), 132,363);
                // w.addObject(new Fehlschuss(), 134, 421);

            }
            else if (schussNr==3)
            {
                w.anzeige(31, true);
                w.anzeige(32, false);
                // w.addObject(new Treffer(), 167,363);
                // w.addObject(new Fehlschuss(), 169, 421);

            }
            else if(schussNr ==4)
            {
                w.anzeige(41, true);
                w.anzeige(42, false);
                // w.addObject(new Treffer(), 202,363);
                // w.addObject(new Fehlschuss(), 204, 421);
            }
            pause(200);
        }

    }

    public void reset()
    {
        MyWorld w = (MyWorld) getWorld();
        w.torwartReset();
        w.pfeilReset();
        w.powerleisteReset();
        w.powerLeisteBallReset();

        start = false;
        tor = false;
        setImage("Ball.png");
        setLocation(350, 420);
        this.getImage().scale(57,56);
        schussFertig = false;
        gehalten= false;

    }

    public void resetLevel()
    {
        MyWorld w = (MyWorld) getWorld();
        reset();
        schussNr = 0;
        anzahlVerschossen = 0;
        anzahlGetroffen = 0;
        w.anzeigeReset();
    }

    /**
     * Move forward by the specified distance.
     * (Overrides the method in Actor).
     */
    @Override
    public void move(int distance)
    {
        move((double)distance);
    }

    /**
     * Move forward by the specified exact distance.
     */
    public void move(double distance)
    {
        double radians = Math.toRadians(getRotation());
        double dx = Math.cos(radians) * distance;
        double dy = Math.sin(radians) * distance;
        setLocation(exactX + dx, exactY + dy);
    }

    /**
     * Set the location using exact coordinates.
     */
    public void setLocation(double x, double y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation((int) (x + 0.5), (int) (y + 0.5));
    }

    /**
     * Set the location using integer coordinates.
     * (Overrides the method in Actor.)
     */
    @Override
    public void setLocation(int x, int y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation(x, y);
    }

    /**
     * Return the exact x-coordinate (as a double).
     */
    public double getExactX() 
    {
        return exactX;
    }

    /**
     * Return the exact y-coordinate (as a double).
     */
    public double getExactY() 
    {
        return exactY;
    }

    public void groeße() // stellt die Größe des Balles ein
    { 
        if (getX()>140 && getX()<570)
        {
            int x = 57; 
            int y = 56;
            if (getY()>=425)
            {
                this.getImage().scale(x,y); // Diese Skalierung ist das Originalbild  
            }
            if (getY()<425 && getY()>400)
            {
                this.getImage().scale(x-3,y-3);
            }
            if (getY()<400 && getY()>375)
            {
                this.getImage().scale(x-6,y-6);
            }
            if (getY()<375 && getY()>350)
            {
                this.getImage().scale(x-9,y-9);
            }
            if (getY()<350 && getY()>325)
            {
                this.getImage().scale(x-12,y-12);
            }
            if (getY()<325 && getY()>300)
            {
                this.getImage().scale(x-15,y-15);
            }
            if (getY()<300 && getY()>275)
            {
                this.getImage().scale(x-18,y-18);
            }
            if (getY()<275 && getY()>250)
            {
                this.getImage().scale(x-21,y-21);
            }
            if (getY()<250 && getY()>230)
            {
                this.getImage().scale(x-24,y-24);
            }
            if (getY()<230 && getY()> 25)
            {
                this.getImage().scale(x-25,y-25);
            }

        }
        else 
        {
            int x = 57; 
            int y = 56;
            if (getY()>=425)
            {
                this.getImage().scale(x,y); // Diese Skalierung ist das Originalbild  
            }
            if (getY()<425 && getY()>400)
            {
                this.getImage().scale(x-3,y-3);
            }
            if (getY()<400 && getY()>375)
            {
                this.getImage().scale(x-6,y-6);
            }
            if (getY()<375 && getY()>350)
            {
                this.getImage().scale(x-9,y-9);
            }
            if (getY()<350 && getY()>325)
            {
                this.getImage().scale(x-12,y-12);
            }
            if (getY()<325 && getY()>300)
            {
                this.getImage().scale(x-15,y-15);
            }
            if (getY()<300 && getY()>275)
            {
                this.getImage().scale(x-18,y-18);
            }
            if (getY()<275 && getY()>250)
            {
                this.getImage().scale(x-21,y-21);
            }
            if (getY()<250 && getY()>230)
            {
                this.getImage().scale(x-24,y-24);
            }

        }

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
