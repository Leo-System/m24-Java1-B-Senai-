package licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite um valor: ");
			int v101 = sc.nextInt();
			System.out.println("Digite outro valor: ");
			int v102 = sc.nextInt();
			int v103 = v101 / v102;
			System.out.println("Resultado: " + 103);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu uma divisão por 0.");
		} catch (InputMismatchException e) {
			System.out.println("Digitar somente númeors inteiros!");
		}
		sc.close();

	}

}
