import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Leaf  extends Actor
{
        private GreenfootImage leaf0 = new GreenfootImage("cutoutleaf0.png");
        private GreenfootImage leaf1 = new GreenfootImage("cutoutleaf1.png");
        private GreenfootImage leaf2 = new GreenfootImage("cutoutleaf2.png");
        private GreenfootImage leaf3 = new GreenfootImage("cutoutleaf3.png");

        /**
         * Randomizes leaves
         */
    public Leaf()
    {
        int randomImage = Greenfoot.getRandomNumber(5);
        if(randomImage == 0)
        {
            setImage("cutoutleaf0.png");
        }
        
        else if(randomImage == 1)
        {
            setImage("cutoutleaf1.png");
        }
        
        else if(randomImage == 2)
        {
            setImage("cutoutleaf2.png");
        }
        else
        {
            setImage("cutoutleaf3.png");
        }
        
     }

     /**
      * Gets rid of object
      */
    public void act() 
    {      
        //makes the leaf move
        move();
        
        //gets rid of object
        if(getY()>=getWorld().getHeight()-1)
        {
            getWorld().removeObject(this);
        }
    }   
    
    /**
     * Makes the leaf move
     */
    private void move()
    {
        int randomSpeed = Greenfoot.getRandomNumber(5);
        setLocation(getX(),getY()+1+randomSpeed);
        setRotation(Greenfoot.getRandomNumber(361));
        int randomTurn = Greenfoot.getRandomNumber(6);
        if(randomTurn == 1)
        {
            setLocation(getX()+1,getY()+1+randomSpeed);
        }
        else if(randomTurn == 2)
        {
            setLocation(getX()+2,getY()+1+randomSpeed);
        }
        else if(randomTurn == 3)
        {
            setLocation(getX()-1,getY()+1+randomSpeed);
        }
        else if(randomTurn == 4)
        {
            setLocation(getX()-2,getY()+1+randomSpeed);
        }
    }
       
}
