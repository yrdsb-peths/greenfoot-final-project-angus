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
    
    Label scoreLabel;
    int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Goalie g = new Goalie();
        addObject(g, 500, 200);
        
        scoreLabel = new Label(0, 55);
        addObject(scoreLabel, 35, 35);
        
        spawnSoccerball();
        spawnApple();
        
    }
    public void spawnApple()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Apple apple = new Apple();
        addObject(apple, x, y);
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
        int x = Greenfoot.getRandomNumber(300);
        int y = Greenfoot.getRandomNumber(300);
        Soccerball ball = new Soccerball();
        addObject(ball, x, y);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            level += 0.25;
        }
    }
    
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("GAME OVER!", 50);
        GameOverWorld world = new GameOverWorld();
        Greenfoot.setWorld(world);
        addObject(gameOverLabel, 300, 200);
    }
}

