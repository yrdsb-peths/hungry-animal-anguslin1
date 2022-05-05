import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score= 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1); 
        
        Elephant e = new Elephant();
        addObject(e, 310, 350);
        Bear b = new Bear();
        addObject(b, 245, 350);
        
        spawnApple();
    }
    
    public void spawnApple(){
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(150);
        
        Apple apple = new Apple();
        addObject(apple, x, y);
    }
}
