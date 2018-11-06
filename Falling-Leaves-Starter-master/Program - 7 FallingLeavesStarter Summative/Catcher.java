 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catcher  extends Actor
{
    /**
     * Runs move() method, touchedLeaf() method
     */
    public void act() 
    {
        move();
        touchedLeaf();
        
        
    } 
    
    /**
     * Lets you control the penguin
     */
    private void move()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-7);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(7);
        }
    }
    
    /**
     * Updates score and makes noise
     */
    private void touchedLeaf()
    {
        if(isTouching(Leaf.class))
        {
            removeTouching(Leaf.class);
            Greenfoot.playSound("au.wav");
            ((AutumnWorld)getWorld()).update();
        }
    }
    
    
    
}

