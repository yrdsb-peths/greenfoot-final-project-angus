import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static int score = 0;
    
    public Label scoreLabel = new Label(0, 80);
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Snake s = new Snake();
        addObject(s, 500, 200);
        
        Goalie g = new Goalie();
        addObject(g, 500, 200);
        
        addObject(scoreLabel, 50,50);
        
        spawnSoccerball();
        
    }
    
    public void createSoccerball()
    {
        Soccerball ball = new Soccerball();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(ball, x, y);
    }
    
    
    public void spawnSoccerball()
    {
        int x = Greenfoot.getRandomNumber(400);
        int y = Greenfoot.getRandomNumber(400);
        Soccerball ball = new Soccerball();
        addObject(ball, x, y);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void gameOver()
    {
        GameOverWorld world = new GameOverWorld();
        Greenfoot.setWorld(world);
        
    }
}

