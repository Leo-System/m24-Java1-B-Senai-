import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A classe abelha existe para ser utilizada no jogo BeeWorld.
 * 
 * @author (Leo) 
 * @version (20/04/2024)
 */
public class Abelha extends Actor
{
    //Constantes:
    public static final int PONTOS = 100;
    //Campos ou fields.
    public int vidas = 0;
    public int score = 0;
    //criando um campo do tipo conjunto de imagens.    
    private GreenfootImage[] imagens;
    //Constructors.
    public Abelha(){
        vidas = 3;
        score = 0;
        //Definir o tamanho do conjunto:
        imagens = new GreenfootImage[4]; //Definindo o tamanho do conjuntp em 4 elementos.
        //definir as imagens:
        for (int i = 0; i < 4; i++){
            imagens[i] = new GreenfootImage("bee0"+ (i+1) + ".png");
        }
    }
    /**
     * Constructor da classe BeeWorld
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        
        //Apertar para a esquerda gira -10 graus.
        if(Greenfoot.isKeyDown("left")){
            turn(-5);
        }else if(Greenfoot.isKeyDown("right")){
            turn(5);
        }else if(Greenfoot.isKeyDown("up")){
            move(3);
        }
        
        //verificando se esta nos cantos.
        verificarPosicao();
        //verifica se toca em uma mosca.
        capturaMosca();
        //Verifica se foi capturada pela Aranha.
        capturadaPelaAranha();
        //Mostrando as vidas.
        mostrarVidas();
        //Mostrando score:
        mostrarScore();
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
            getWorld().addObject(new Mosca(Greenfoot.getRandomNumber(5)+1, Greenfoot.getRandomNumber(360)) , pX, pY);
            Greenfoot.playSound("slurp.mp3");
            //Aumentando o score:
            score += PONTOS;
        }
    }
    
    /***
     * método que irá capturar a abelha pela aranha.
     */
    public void capturadaPelaAranha(){
        int pX = Greenfoot.getRandomNumber(getWorld().getWidth()), pY = Greenfoot.getRandomNumber(getWorld().getHeight());
        
        if (isTouching(Aranha.class)){
            setLocation(pX, pY);
            Greenfoot.playSound("oomph.mp3");
            vidas--; //decremento
            if (vidas < 1){
                Greenfoot.stop();
                getWorld().showText("GAME OVER!!!", 400, 300);
            }
        }
    }

    public void mostrarVidas(){
        getWorld().showText("vidas: "+ vidas, 60, 20);
    }

    public void mostrarScore(){
        getWorld().showText("score: "+ score, 700, 20);
    }
}


