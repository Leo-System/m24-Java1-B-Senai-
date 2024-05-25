package br.com.senaisp.bauru.Leo.Licao04;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//Strings
		String nome1 = "Richard";
		String nome2 = "Richard";
		
		System.out.println("Digite o nome: ");
		nome2 = scn.next();
		//Quando dois iterais (vaores fixos no código que não são constantes) têm o mesmo valor de string o java cria uma só string e atribui o endereço de memória dessa string em cada variável com ela.
		
		//comparando endereços de memória.
		if (nome1 == nome2) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
		
		//comparando conteúdo do objeto:
		if(nome1.equals(nome2)) {
			System.out.println("Têm o mesmo valor");
		}else{
			System.out.println("Não têm o mesmo valor");
		}
		
		//nome1 é maior que o nome2:
		if(nome1.compareTo(nome2) < 0) {
			System.out.println("Nome 1 é maior");
		}
		if(nome1.compareTo(nome2) > 0) {
			System.out.println("Nome 1 é menor");
		}
		if(nome1.compareTo(nome2) == 0){
			System.out.println("Ambos tem o mesmo tamanho");
		}
		
	}

}
