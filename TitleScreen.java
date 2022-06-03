import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("GAME", 75);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    /**
     * The main world act loop.
     */
    public void act()
    {
        // Start game if user presses space.
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
     private void prepare()
    {
        Snake snake = new Snake();
        addObject(snake,524,52);
        snake.setLocation(300,343);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,254,124);
        label.setLocation(391,264);
        label.setLocation(317,130);
        Label label2 = new Label("Use arrow keys to move", 40);
        addObject(label2,254,186);
        label2.setLocation(334,191);
        label2.setLocation(326,244);
        label.setLocation(329,191);
        label.setLocation(314,154);
        label2.setLocation(319,207);
        label.setLocation(294,100);
        label2.setLocation(422,132);
        removeObject(label2);
    }
}
}