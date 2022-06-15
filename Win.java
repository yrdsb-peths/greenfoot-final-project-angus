import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Screen you see when you have won all 10 levels.
 * Source of Picture: http://www.stol.it/var/ezflow_site/storage/images/media/images/bildverwaltung/artikel_sport_im_ueberblick_fussball/fc-bayern-champions-league-sieger-2012-13/7384394-1-ger-DE/FC-Bayern-Champions-League-Sieger-2012-13.jpg
 * Picture Edited with: Paint.net
 * @author (Frederic Risling) 
 * @version (1.0)
 */
public class Win extends World
{
    public Win()
    {    
        super(700, 465, 1); 
        setBackground(new GreenfootImage("WIN.jpg"));
        addObject(new Button2(), 600, 100);
    }
}
