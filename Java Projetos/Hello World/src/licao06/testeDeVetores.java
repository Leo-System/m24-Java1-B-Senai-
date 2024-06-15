package licao06;

import java.util.Scanner;

public class testeDeVetores {

	public static void main(String[] args) {
		int[] valores = new int[10];
		Scanner scn = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Insira o valor da posição " + i + " do vetor: ");
			valores[i] = scn.nextInt();
		}
		
		System.out.println("Mostrando os valores inseridos: ");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Valor " + i + ": " + valores[i]);
		}
		
		scn.close();
	}

}
