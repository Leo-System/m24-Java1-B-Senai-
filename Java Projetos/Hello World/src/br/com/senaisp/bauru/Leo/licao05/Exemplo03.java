package br.com.senaisp.bauru.Leo.licao05;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		//Utilizamdo o Sacnner para separar os nomes
		Scanner scA = new Scanner(nome);
		String primeiroNome = " ", ultimoNome = " ";
		//utilizando o laço while
		while (scA.hasNext()) {
			ultimoNome = scA.next();
			if(primeiroNome.equals(" ")) {
				primeiroNome = ultimoNome;
			}
		}
		
		System.out.println("Primeiro Nome: " + primeiroNome);
		System.out.println("Ultimo Nome: " + ultimoNome);
		
		scA.close();
		sc.close();
	}

}
