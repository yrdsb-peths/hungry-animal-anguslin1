import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    int speed = 100;
    public void act()
    {
        if(Greenfoot.isKeyDown("a")){
            move(-5);
        }
        if(Greenfoot.isKeyDown("d")){
            move(5);
        }
        
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnApple();
        }
    }
}
