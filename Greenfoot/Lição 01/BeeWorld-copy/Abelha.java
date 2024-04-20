import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A classe abelha existe para ser utilizada no jogo BeeWorld.
 * 
 * @author (Leo) 
 * @version (20/04/2024)
 */
public class Abelha extends Actor
{
    /**
     * Constructor da classe BeeWorld
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        
        //Apertar para a esquerda gira -10 graus.
        if(Greenfoot.isKeyDown("left")){
            turn(-10);
        }else if(Greenfoot.isKeyDown("right")){
            turn(10);
        }
    }
}
