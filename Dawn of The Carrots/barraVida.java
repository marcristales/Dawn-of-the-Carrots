import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class barraVida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class barraVida extends Actor
{
    /**
     * Act - do whatever the barraVida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int vida = 50;
    public barraVida()
    {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0,0,51,11);
        getImage().setColor(new Color(0,255,150));
        getImage().fillRect(1,1,vida,10);
    }
    public void act()
    {
        setImage(new GreenfootImage(52, 12));
        getImage().drawRect(0,0,51,11);
        getImage().setColor(new Color(0,255,150));
        getImage().fillRect(1,1,vida,10);
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        setLocation(myWorld.getRay().getX() - 5, myWorld.getRay().getY() + 60);
        perderVida();
    }
    public void perderVida()
    {
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        if (myWorld.getRay().hitByZombnahoria())
        {
            vida--;
        }
        if (vida <= 0)
        {
            getWorld().showText("¡Has perdido! \n Sobreviviste por: " + (myWorld.getRay().tiempo/60) + " segundos", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }
    }
}
