package licao06;

import java.util.Scanner;

public class TesteBaralho {

	public static void main(String[] args) {
		Baralho ba = new Baralho();
		Carta ct;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira quantas cartas serão exibidas: ");
		int entrada = sc.nextInt(); 
		
		for(int i = 0; i < entrada; i++) {
			ct = ba.sortearCarta();
			System.out.println(ct.toString());
			
		}

		
		sc.close();
	}

}
