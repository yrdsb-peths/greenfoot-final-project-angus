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
        
       
        Goalie g = new Goalie();
        addObject(g, 500, 200);
        
        scoreLabel = new Label(0, 55);
        addObject(scoreLabel, 35, 35);
        
        spawnSoccerball();
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
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("GAME OVER!", 50);
        addObject(gameOverLabel, 300, 200);
    }
}

