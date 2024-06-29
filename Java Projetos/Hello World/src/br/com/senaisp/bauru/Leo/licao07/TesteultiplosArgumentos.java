package br.com.senaisp.bauru.Leo.licao07;

public class TesteultiplosArgumentos {

	public static void main(String[] args) {
		System.out.println("Soma de dois valores: " + CalcularSoma(10, 20));
		System.out.println("Soma de dois valores: " + CalcularSoma(10, 20, 30, 40));
	}
	
	public static int CalcularSoma(int ... itens) {
		int ret = 0;
		
		for(int v1 : itens) {
			ret += v1;
		}
		
		return ret;
	}
	
	public static int CalcularSomaX(int ... itens, double abc) {
		int ret = 0;
		
		for(int v1 : itens) {
			ret += v1;
		}
		
		System.out.println(abc);
		return ret;
	}

}
