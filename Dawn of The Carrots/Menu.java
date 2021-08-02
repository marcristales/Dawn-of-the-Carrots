import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    Selector selector = new Selector();
    private int opcion = 0;
    GreenfootSound musica = new GreenfootSound("The Graveyard.mp3");
    
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1189, 841, 1);
        prepararMundo();
    }
    
    public void prepararMundo()
    {
        addObject(new Start(), 250, 420);
        addObject(new Help(), 270, 550);
        addObject(new menuRay(), 900, 570);
        addObject(new Exit(), 280, 690);
        addObject(selector, 490, 390);
    }
    
    public void act()
    {
        String tecla = Greenfoot.getKey();
        if (tecla != null && tecla.equals("s") && opcion != 2)
        {
            opcion++;
        }
        if (tecla != null && tecla.equals("w") && opcion != 0)
        {
            opcion--;
        }
        
        selector.setLocation(490, 390 + (opcion*125));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER"))
        {
            switch(opcion){
                case 0:
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 1:
                    Greenfoot.setWorld(new Instrucciones());
                    break;
                case 2:
                    Greenfoot.stop();
            }
        }
        
        musica.play();
    }
}
