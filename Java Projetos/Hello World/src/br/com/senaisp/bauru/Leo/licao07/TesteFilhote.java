package br.com.senaisp.bauru.Leo.licao07;

public class TesteFilhote {

	public static void main(String[] args) {
		Filhote fl01 = new Filhote("Filhote 01");
		Filhote fl02 = new Filhote("Filhote 02");
		Filhote fl03 = new Filhote("Filhote 03");
		
		//mostrando o nome e o id dos filhotes:
		
		System.out.println(fl01.getId() + "-" + fl01.getNome());
		System.out.println(fl02.getId() + "-" + fl02.getNome());
		System.out.println(fl03.getId() + "-" + fl03.getNome());
	}

}
