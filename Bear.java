import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    /**
     * Act - do whatever the bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 5, getY()); 
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 5, getY()); 
        }
        if(Greenfoot.isKeyDown("up"))
            setLocation(getX(), getY() - 5); 
        if(Greenfoot.isKeyDown("down"))
            setLocation(getX(), getY() + 5); 
        
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnApple();
        }
    }
}
