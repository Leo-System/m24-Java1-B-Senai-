package br.com.senaisp.bauru.Leo.Licao02;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nome;
		
		//Mostrando mensagem para o usuário:
		System.out.println("Digite seu nome completo: ");
		nome = scn.nextLine();
		
		//Vamos separar nome de sobrenome:
		String primNome = nome.substring(0, (nome + " ").indexOf(" "));
		
		//Pegando o último sobrenome:
		String LastName = nome.substring(nome.lastIndexOf(" ") +1);
		
		System.out.println(primNome);
		System.out.println(LastName);
		
		scn.close();
	}

}
