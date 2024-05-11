import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alienigina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alienigina extends Actor
{
    public int pX = 1;
    /**
     * Act - do whatever the Alienigina wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(pX);
        if ( isAtEdge() ){
            pX *= -1;
            setLocation(getX(), getY()+30);
        }
        
        if(isTouching(Nave.class)){
            getWorld().showText("GAME OVER", 400, 300);
            Greenfoot.stop();
        }
    }
}
