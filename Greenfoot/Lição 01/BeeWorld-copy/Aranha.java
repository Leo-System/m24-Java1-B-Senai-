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
        acelerarAranha();
        capturaMosca();
        //Interceptando a abelha.
        interceptarAbelha();
    }
    
    /***
     * Método que irá acelerar a aranha em determinada área do tabuleiro.
     */
    public void acelerarAranha(){
           if (getX() >= 200 && getX()<=600 && getY() >=100 && getY() <=500){
               move(2);
           }
    }

    /***
     * método que captura a mosca pela Aranha.
     */
    public void capturaMosca(){
        //verificando se tocou na mosca.
        if (isTouching( Mosca.class )){
            //remove a mosca.
            removeTouching( Mosca.class );
            //Adicionando uma nova mosca.
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth()), pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca() , pX, pY);
        }
    }

    public void interceptarAbelha(){
        //Cast de BeeWorld => Força o mindo a ser do tipo BeeWorld.
        Abelha ab = ((BeeWorld) getWorld()).getAbelha();
        if (ab != null){
            turnTowards(ab.getX(), ab.getY());
        }
    }
}


