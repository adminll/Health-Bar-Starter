import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutumnWorld  extends World
{
    private Scoreboard score;
    
    
    /**
     * Constructor for objects of class FallWorld.
     * 
     */
    public AutumnWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(750, 500, 1); 
        
        //Creates score
        score = new Scoreboard();
        
        //adds everything to the world
        prepare();
        
        
    }
    
   /**
    * act - things you want to do each time around go in here
    * adds leaves
    */
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Leaf(),Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(10));
        }
        
        
    }
    /**
     * Adds catcher and score
     */
   private void prepare()
   {
       addObject(score,375,20);
       addObject(new Catcher(),350,450);
   }
   /**
    * updates score
    */
   public void update()
    {
        score.addToScore();
    }
}
