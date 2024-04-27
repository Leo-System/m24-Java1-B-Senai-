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
        
        //verificando se esta nos cantos.
        verificarPosicao();
        //verifica se toca em uma mosca.
        capturaMosca();
    }
    
    /**
     * Método que verifica se está na direita do mundo.
     */
    public boolean isNaDireita(){
        if(getX() > getWorld().getWidth()-10){
            return true;
        }
        return false;
    }
    
    /**
     * Método que verifica se está na esquerda do mundo.
     */
    public boolean isNaEsquerda(){
        return (getX() < 10);
    }
    
    /**
     * Método que verifica se está na base do mundo.
     */
    public boolean isNaBase(){
        return (getY() > getWorld().getHeight()-10);
    }
    
    /**
     * Método que verifica se está no topo.
     */
    public boolean isNoTopo(){
        return ( getY() < 10 );
    }
    
    /**
     * método que verifica se a abelha está nos cantos e reposiciona ela.
     */
    public void verificarPosicao(){
        //verificando se esta na direita
        if ( isNaDireita() ){
            setLocation(10, getY());
        }
        //VERIFICA SE ESTA NA ESQUERDA
        if( isNaEsquerda() ){
            setLocation(getWorld().getWidth()-10, getY());
        }
        //verifica se esta no topo.
        if ( isNoTopo() ){
            setLocation(getX(), getWorld().getHeight()-10);
        }
        //Verificando se esta na base.
        if( isNaBase() ){
            setLocation(getX(),10);
        }
    }
    
    /**
     * Método que captura a mosca.
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
}

