package licao06;

import java.util.Scanner;

public class testeDeMatrizes {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Scanner scn = new Scanner(System.in);
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Insira o valor da posição " + i + " " + j + " do vetor: ");
				matriz[i][j] = scn.nextInt();
			}
		}
		
		System.out.println("Exibindo os valores da matriz: ");
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Posição " + i + " " + j + ": " + matriz[i][j]);
			}
		}
		
		scn.close();
	}

}
