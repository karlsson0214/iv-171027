import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author Rikard Karlsson 
 * @version 17-10-27
 */
public class Lobster extends Actor
{
    private Crab myCrab;
    
    public Lobster(Crab theCrab)
    {
        myCrab = theCrab;
    }
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turnTowards(myCrab.getX(), myCrab.getY());
        move(1);
    }    
}
