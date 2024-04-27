import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aranha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aranha extends Inseto
{
    /**
     * Act - do whatever the Aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        
        //verifica se o número aleatório de 1 a 100 é menor que 10.
        if(Greenfoot.getRandomNumber(100)+1 <= 10){
            //vira a aranha para a direita um número entre 1 até 21.
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        verificarCanto();
    }
}
