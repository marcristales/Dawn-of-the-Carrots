import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bala()
    {
        GreenfootImage balita = getImage();
        balita.scale(35, 35);
    }
    public void act()
    {
        move(10);
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
