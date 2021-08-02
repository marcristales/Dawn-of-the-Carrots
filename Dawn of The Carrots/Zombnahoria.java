import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombnahoria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombnahoria extends Actor
{
    
    int vida = 3;
    Ray jugador;
    Counter counter;
    public Zombnahoria(Ray mainRay, Counter counter)
    {
        this.counter = counter;
        jugador = mainRay;
        GreenfootImage zanahoria = getImage();
        zanahoria.scale(95, 95);
    }
    public void act()
    {
        moverse();
        hitBox();
    }
    
    public void moverse()
    {
        move(1);
        turnTowards(jugador.getX(), jugador.getY());
    }
    
    public void hitBox()
    {
        Actor bala = getOneIntersectingObject(Bala.class);
        if (bala != null)
        {
            vida--;
            getWorld().removeObject(bala);
        }
        if (vida == 0){
            counter.score++;
            getWorld().removeObject(this);
        }
    }
}
