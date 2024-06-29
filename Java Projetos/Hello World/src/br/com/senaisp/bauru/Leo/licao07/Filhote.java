package br.com.senaisp.bauru.Leo.licao07;

/*
 * Utilização de campo estático:
 */

public class Filhote {
	private static int nSeq = 0;
	private int id;
	private String nome;
	
	//constructor
	public Filhote(String nome) {
		id = ++nSeq;
		this.setNome(nome);
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//getterrs e setter:
	
}
