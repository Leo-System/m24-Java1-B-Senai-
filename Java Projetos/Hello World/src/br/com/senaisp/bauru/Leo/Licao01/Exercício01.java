package br.com.senaisp.bauru.Leo.Licao01;

import java.util.Locale;
import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//Criando uma ferramenta para fazer entrada de dados. O sistem.in serve para indicar que é entrada de teclado.
		//Scanner scn = new Scanner(System.in).useLocale(Locale.US); O ".useLocale(Locale.US)" aqui serve para forçar o usuário para inserir um valor decimal com os padrões americanos, sem ele o Scanner vai pegar o padrão da máquina, que aqui é Brazil.
		
		double galoes = 15, litros = 0, gal2lt = 3.785;//gal2lt significa galões para litros.
		
		//Solicitando que o usuário entre com dados:
		System.out.println("Digite a quantidade de galões: ");
		galoes = scn.nextDouble(); //Usando o scn criado lá atrás para receber o dado.
		
		//Fazendo as contas: 
		litros = galoes * gal2lt;
		
		//mostrando o resultado
		System.out.println(galoes + " galões equivalem a: " + litros + " litros");
		
		scn.close(); //Isto serve para evitar o vazamento de dados. è importante que se feche a entrada depois da última entrada do usuário, pois se fizer antes tem que criar uma ferrementa (que significa copiar a linha que se cria a ferramenta {aqui é linha 9}))
	}

}
