import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta classe vai representar umplacr no jogo BeeWorld.
 * 
 * @author (Leo) 
 * @version (11/05/2024)
 */
public class Placar extends Actor
{
    //Fields, Campos ou variáveis de instância
    private String texto;
    private int tamanhoTexto;
    private Color corFonte;
    
    //Constructor
    public Placar(){
        texto = "Score: 0";
        tamanhoTexto = 20;
        corFonte = Color.BLUE;
        corFonte = new Color(0, 0, 255, 200);
        atualizarImagem();
    }
    
    //Getters (acessadores de campos) e setter (modificadore de campos)
    public String getTexto(){
        return texto;
    }
    
    public void setTexto(String value){
        texto = value;
        atualizarImagem();
    }
    
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void atualizarImagem(){
        GreenfootImage img = new GreenfootImage(tamanhoTexto * texto.length(), tamanhoTexto);
        img.setColor(corFonte);
        //                 NomeFonte, bold, italic, tamanho
        img.setFont(new Font("Arial", true, false, tamanhoTexto));
        img.drawString(texto, 0, tamanhoTexto);
        setImage(img);
    }
}
