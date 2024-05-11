import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que representa a bala no jogo.
 * 
 * @author (Leo) 
 * @version (27/04/2024)
 */
public class Bala extends Actor
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()-5);
        //removendo o alienígena:
        removerAlien();
        //removendo a bala.
        if( isAtEdge() ){
            ((SpaceInvadersWorld) getWorld()).removerBala();
        }
    }
    
    /**
     * Método que verifica se a bala atinge o alien e remove ele.
     */
    public void removerAlien(){
        if( isTouching(Alienigina.class) ){
            removeTouching(Alienigina.class);
            //criando um novo alien
            getWorld().addObject(new Alienigina(), Greenfoot.getRandomNumber(getWorld().getWidth()), 50);
        }
    }
}
