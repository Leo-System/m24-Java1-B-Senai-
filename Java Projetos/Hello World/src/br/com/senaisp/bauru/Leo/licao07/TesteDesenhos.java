package br.com.senaisp.bauru.Leo.licao07;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TesteDesenhos {

	public static void main(String[] args) {
		//criando a janela
		JOptionPane janela = new JOptionPane();
		
		//criando a janela com dialogo
		JDialog dlg = janela.createDialog("Desenhos");
		
		//dimensionando a janela
		dlg.setSize(800, 600);
		
		//criando nosso conteudo
		DesenhoSwing desenho = new DesenhoSwing();
		
		//Atribuindo o desenho à janela
		dlg.setContentPane(desenho);
		
		//mostrando a janela
		dlg.setVisible(true);
	}

}
