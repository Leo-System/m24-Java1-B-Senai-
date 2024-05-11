import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe responsável pelo mundo do space invaders.
 * 
 * @author (Leo) 
 * @version (27/04/2024)
 */
public class SpaceInvadersWorld extends World
{
    private Bala bala = null;
    /**
     * Constructor for objects of class SpaceInvadersWorld.
     * 
     */
    public SpaceInvadersWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Alienigina alienigina = new Alienigina();
        addObject(alienigina,101,103);
        Nave nave = new Nave();
        addObject(nave,108,253);
        Bala bala = new Bala();
        addObject(bala,96,154);
        nave.setLocation(128,266);
        bala.setLocation(118,269);
        nave.setLocation(108,272);
        nave.setLocation(108,274);
        nave.setLocation(77,288);
        nave.setLocation(418,228);
        bala.setLocation(421,228);
        removeObject(bala);
        nave.setLocation(419,555);
        alienigina.setLocation(396,66);
    }
    
    public Bala getBala(){
        return bala;
    }
    
    public void criarBala(int pX, int pY){
        if(bala == null){
            bala = new Bala();
            addObject(bala, pX, pY);
        }
    }
    
    public void removerBala(){
        if(bala != null){
            removeObject(bala);
            bala = null;
        }
    }
}
