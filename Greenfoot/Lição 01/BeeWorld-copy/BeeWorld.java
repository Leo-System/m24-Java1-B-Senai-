import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da abelha no jogo.
 * 
 * @author (Leo) 
 * @version (20/04/2024)
 */
public class BeeWorld extends World
{
    //Campos e fields:
    private Abelha abelha = null;
    private int score;
    private Placar placar = null;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        abelha = new Abelha();
        addObject(abelha,57,60);
        
        Aranha aranha = new Aranha();
        addObject(aranha,510,136);
        
        //utilizando for para criar as moscas.
        for (int i = 0; i < 20; i++){
            int pX = Greenfoot.getRandomNumber(getWidth()), pY = Greenfoot.getRandomNumber(getHeight());
            int vel = Greenfoot.getRandomNumber(5)+1;
            int ang = Greenfoot.getRandomNumber(360);
            addObject(new Mosca(vel, ang), pX, pY);
        }
        //criando o placar no mundo
        placar = new Placar();
        addObject(placar, 750, 30);
    }

    /***
     * getter para obter a instância da abelha cirada no mundo.
     */
    public Abelha getAbelha(){
        return abelha;
    }
    
    public void addScore(int value){
        score += value;
        placar.setTexto("Score :" + score);
    }
}
