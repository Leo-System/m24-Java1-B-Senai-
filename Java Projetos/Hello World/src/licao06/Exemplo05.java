package licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.senaisp.bauru.Leo.licao07.Utils;

public class Exemplo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vlr01 = 0, vlr02 = 0;
		//garantindo a entrada do primeiro valor.
		do {
			System.out.println("Digite o primeiro valor: ");
			try {
				vlr01 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor deve ser inteiro!");
				sc.nextLine(); //captura o enter
				vlr01 = 0;
			}
		}while(vlr01 <= 0);
		
		vlr02 = Utils.lerInteiro(sc, "Digite o segundo valor: ", 1, Integer.MAX_VALUE);
		
		int vlr03 = vlr01 / vlr02;
		System.out.println("Resultado: " + vlr03);
		
		sc.close();
	}

}
