import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa o Inseto que será utilizado no jogo.
 * 
 * @author (Leo) 
 * @version (27/04/2024)
 */
public class Inseto extends Actor
{
    /**
     * Act - do whatever the Inseto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    /**
     * métodod que irá verificar se o objeto esta no canto do mundo.
     */
    public void verificarCanto(){
        if (isAtEdge()){
            turn(180);
        }
    }
}
