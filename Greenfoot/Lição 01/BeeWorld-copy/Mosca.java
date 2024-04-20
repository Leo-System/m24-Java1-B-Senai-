import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe mosca destinada a fazer parte do jogo BeeWorld. 
 * @author (Leo) 
 * @version (20/04/2024)
 */
public class Mosca extends Actor
{
    /**
     * O método act sepre será executado quando se apertar o botão act ou ficará em execução constante quando o botão run for apertado.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if(isAtEdge()){
            turn(180);    
        }
    }
}
