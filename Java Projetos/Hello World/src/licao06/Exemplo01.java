package licao06;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valores;
		
		System.out.println("Digite o número de elementos que você deseja?");
		int qtde = sc.nextInt();
		valores = new int[qtde];
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite o elemento " + (i+1) + ":");
			valores[i] = sc.nextInt();
		}
		
		int maior = valores[0], soma = 0;
		
		for(int i = 0; i < valores.length; i++) {
			soma += valores[i];
			
			if(valores[i] > maior) {
				maior = valores[i];
			}
		}
		
		float media = soma / qtde;
		
		System.out.println("Media: " + media);
		System.out.println("Soma dos valores: "+ soma);
		System.out.println("Maior valor: " + maior);
		
		
		sc.close();
	}

}
