import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Start screen.
 * Source of picture: https://www.footballpulp.com/wp-content/uploads/2016/09/Champions-League.jpg
 * Picture edited with: paint.net
 * Audio Source:http://mp3goo.co/get/aR17FEl_bvDGJt87eoNRHcDKNBedgsjHv-DVnBUIn6-YIX4P8Wsyiy1bdq61L0PHOEn6p1RmCLnYCwj_kCWPl_TTeYe6AYv9IitCPuZKUX46yKE85_W_l-V6DGOYD4RSPtApNpY3C9s0s5ugowUspgMcHHcZ_uRgrYMFcse__CA/UEFA+Champions+League+-+Main+Theme.html
 * @author (Frederic Risling) 
 * @version (1.0)
 */
public class Start extends World
{
    private Button button1 = new Button();
    
    public Start()
    {    
        super(700, 465, 1);
        setBackground(new GreenfootImage("Start.jpg"));
        addObject(button1, 100, 300);
    }
    
    public void music()
    {
        Greenfoot.playSound("CL.mp3");
    }

    
}
