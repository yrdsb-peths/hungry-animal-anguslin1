import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    
    public Label scoreLabel = new Label(0, 80);
    public MyWorld()
    {    
        super(600, 400, 1, false); 
        
        Elephant e = new Elephant();
        addObject(e, 310, 350);
        
        Bear b = new Bear();
        addObject(b, 245, 350);
        
        addObject(scoreLabel, 50,50);
    
        spawnApple();
    }
    
    public void spawnApple(){
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(150);
        
        Apple apple = new Apple();
        addObject(apple, x, y);
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
