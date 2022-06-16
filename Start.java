import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Start extends World
{
    private Button button1 = new Button();

    public Start()
    {    
        super(700, 465, 1);
        setBackground(new GreenfootImage("Start.jpeg"));
        addObject(button1, 100, 300);
        prepare();
    }

    public void music()
    {
        Greenfoot.playSound("CL.mp3");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Use Spacebar", (40));
        addObject(label,368,385);
        label.setLocation(357,383);
        label.setLocation(405,370);
        Label label2 = new Label("Use Spacebar to Aim and set Power", (40));
        addObject(label2,405,370);
        label.setLocation(408,379);
        label2.setLocation(504,213);
        label.setLocation(384,384);
        label.setLocation(498,385);
        label.setLocation(497,385);
        removeObject(label);
        label2.setLocation(425,379);
        label2.setLocation(455,381);
        label2.setLocation(371,370);
    }
}
