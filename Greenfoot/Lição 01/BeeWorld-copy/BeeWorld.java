import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da abelha no jogo.
 * 
 * @author (Leo) 
 * @version (20/04/2024)
 */
public class BeeWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Abelha abelha = new Abelha();
        addObject(abelha,57,60);
        Aranha aranha = new Aranha();
        addObject(aranha,510,136);
        Mosca mosca = new Mosca();
        addObject(mosca,263,299);
    }
}
