import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instrucciones extends World
{

    /**
     * Constructor for objects of class Instrucciones.
     * 
     */
    public Instrucciones()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1189, 841, 1); 
    }
    
    public void act()
    {
        String regreso = Greenfoot.getKey();
        if (regreso != null && regreso.equals("b"))
        {
            Greenfoot.setWorld(new Menu());
        }
    }
}
