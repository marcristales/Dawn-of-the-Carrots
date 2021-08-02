import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menuRay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menuRay extends Actor
{
    
    int movimiento;
    public void act()
    {
        effecto();
    }
    
    public void effecto()
    {
        if (movimiento == 0)
        {
            move(-2);
            movimiento = 1;
        }
        else if (movimiento == 1)
        {
            move(2);
            movimiento = 0;
        }
    }
}
