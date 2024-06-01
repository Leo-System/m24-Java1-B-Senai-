package br.com.senaisp.bauru.Leo.Licao04;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String palavraSecreta = "Java";
		
		System.out.println("Digite uma letra: ");
		String letra = scr.next();
		
		if(palavraSecreta.indexOf(letra.charAt(0)) > -1){
			System.out.println("A palavra contém a letra " + "que digitou na posição "+ palavraSecreta.indexOf(letra.charAt(0)));
		}
	}

}
