import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a nave do jogo.
 * 
 * @author (Leo) 
 * @version (17/04/2024)
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //verificando se foi teclado para esquerda.
        if ( Greenfoot.isKeyDown("left") ){
            move(-2);
        }
        //verificando se foi teclado para a direita, e movendo para a direita.
        if ( Greenfoot.isKeyDown("right") ){
            move(2);
        }
        //Conferindo se deu o tiro.
        if (Greenfoot.isKeyDown("space")){
            ((SpaceInvadersWorld) getWorld()).criarBala(getX(), getY()-45);
        }
    }
}
