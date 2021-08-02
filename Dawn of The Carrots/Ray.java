import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ray extends Actor
{
    /**
     * Act - do whatever the Ray wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int velocidad = 3;
    int tiempo = 0;
    int dash = 0;
    GreenfootSound disparoSFX = new GreenfootSound("Pistol Shot Sound Effect.mp3");
    
    public void act()
    {
        tiempo++;
        voltear();
        caminar();
        disparar();
        hitByZombnahoria();
    }
    
    public Ray() 
    {
        GreenfootImage imagen = getImage();
        imagen.scale(85, 85);
    }
    
    public void voltear()
    {
        if (Greenfoot.getMouseInfo() != null)
        {
            turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());    
        }
    }
    
    public void caminar()
    {
        if (Greenfoot.isKeyDown("w"))
        setLocation(getX(),getY() - velocidad);
        if (Greenfoot.isKeyDown("a"))
        setLocation(getX() - velocidad,getY());
        if (Greenfoot.isKeyDown("s"))
        setLocation(getX(),getY() + velocidad);
        if (Greenfoot.isKeyDown("d"))
        setLocation(getX() + velocidad,getY());
    }
    
    
    public void disparar()
    {

        if (Greenfoot.mousePressed(null))
        {
            Bala bala = new Bala();
            getWorld().addObject(bala, getX(), getY());
            bala.setRotation(getRotation());
        }
    }
    
    public boolean hitByZombnahoria()
    {
        Actor zombnahoria = getOneObjectAtOffset(0,0, Zombnahoria.class);
        if (zombnahoria != null)
        {
            return true;
        }
        else
        return false;
    }
}
