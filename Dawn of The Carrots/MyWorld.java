import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.core.*;
import javax.swing.*;
import java.awt.*;

public class MyWorld extends World
{

    int contador = 0;
    int velocidadSpawn = 50;
    int spawnAleatorio;
    public Ray mainRay = new Ray();
    Counter counter = new Counter();
    barraVida barravida = new barraVida();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1189, 841, 1); 
        addObject(mainRay, getWidth()/2, getHeight()/2);
        addObject(counter, 80, 80);
        addObject(barravida, mainRay.getX() - 5, mainRay.getY() + 60);
    }
    
    public Ray getRay()
    {
        return mainRay;
    }
    
    public void act()
    {
        contador++;
        spawnZombnahorias();
    }
    
    public void spawnZombnahorias()
    {
        if (contador % velocidadSpawn == 0)
        {
            spawnAleatorio = Greenfoot.getRandomNumber(8);
            switch(spawnAleatorio)
            {
                case 0 : addObject(new Zombnahoria(mainRay, counter), 0, 0);
                case 1 : addObject(new Zombnahoria(mainRay, counter), getWidth()/2, 0); break;
                case 2 : addObject(new Zombnahoria(mainRay, counter), getWidth(), 0); break;
                case 3 : addObject(new Zombnahoria(mainRay, counter), 0, getHeight()/2); break;
                case 4 : addObject(new Zombnahoria(mainRay, counter), getWidth(), getHeight()/2); break;
                case 5 : addObject(new Zombnahoria(mainRay, counter), 0, getHeight()); break;
                case 6 : addObject(new Zombnahoria(mainRay, counter), getWidth()/2, getHeight()); break;
                case 7 : addObject(new Zombnahoria(mainRay, counter), getWidth(), getHeight()); break;
            }
        }
    }
}
