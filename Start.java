import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
