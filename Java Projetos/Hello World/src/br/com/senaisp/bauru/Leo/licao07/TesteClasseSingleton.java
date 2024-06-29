package br.com.senaisp.bauru.Leo.licao07;

public class TesteClasseSingleton {

	public static void main(String[] args) {
		ClasseSingleton obj01 = ClasseSingleton.getInstancia();
		ClasseSingleton obj02 = ClasseSingleton.getInstancia();
		
		//Alterando daods
		System.out.println(obj01);
		System.out.println(obj02);
		
		obj01.setNome("Roberval");
		System.out.println(obj02.getNome());
	}

}
