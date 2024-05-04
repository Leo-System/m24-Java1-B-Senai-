import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe mosca destinada a fazer parte do jogo BeeWorld. 
 * @author (Leo) 
 * @version (20/04/2024)
 */
public class Mosca extends Inseto
{
    //Campos e fields:
    private int velocidade;
    //Constructor padrão (não recebe parâmetros):
    public Mosca(){
        velocidade = 1;
    }
    //Constructor personalisado como sobrecarga de métodos
    public Mosca(int vel, int ang){
        velocidade = vel;
        setRotation(ang); //colocando no angulo que eu passar.
    }
    /**
     * O método act sepre será executado quando se apertar o botão act ou ficará em execução constante quando o botão run for apertado.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        verificarCanto();
    }
}
