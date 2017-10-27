import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author Rikard Karlsson 
 * @version 17-10-27
 */
public class Crab extends Actor
{
    private GreenfootImage image0 = new GreenfootImage("crab.png");
    private GreenfootImage image1 = new GreenfootImage("crab2.png");
    private boolean isAlive = true;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isAlive)
        {
            animate();
            move();
            checkEaten();
        }
        else if (getImage().getWidth() > 4 && getImage().getHeight() > 4)
        {
            shrinkWithPercent(10);
        }
        
    } 
    private void animate()
    {
        if (getImage() == image0)
        {
            setImage(image1);
        }
        else
        {
            setImage(image0);
        }        
    }
    private void move()
    {
        move(3);
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-10);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            turn(10);
        }
    }
    private void checkEaten()
    {
        if (isTouching(Lobster.class))
        {
            isAlive = false;
        }
    }
    private void shrinkWithPercent(int percentToShrink)
    {
        double changeFactor = (100 - percentToShrink) / 100.0;
        GreenfootImage image = getImage();
        image.scale((int)(image.getWidth() * changeFactor) , (int)(image.getHeight() * changeFactor));        
    }
}
