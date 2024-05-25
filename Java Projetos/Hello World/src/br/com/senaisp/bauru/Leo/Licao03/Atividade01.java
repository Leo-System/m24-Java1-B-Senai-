package br.com.senaisp.bauru.Leo.Licao03;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double area, base, haltura;
		
		System.out.println("Insira a base do triângulo: ");
		base = scn.nextDouble();
		
		System.out.println("Insira a base do haltura: ");
		haltura = scn.nextDouble();
		
		area = base * haltura / 2;
		
		System.out.println("A área do triângulo é: " + area);
		
		scn.close();
	}

}