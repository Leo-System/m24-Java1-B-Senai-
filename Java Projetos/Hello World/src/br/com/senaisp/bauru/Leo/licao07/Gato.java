package br.com.senaisp.bauru.Leo.licao07;

public class Gato extends Mamifero{
	//fields
	private boolean quadrupede;
	
	//constructor
	public Gato(String nome) {
		setNome(nome);
	}
	
	public Gato(int idade, String nome) {
		setIdade(idade);
		setNome(nome);
	}
	
	public Gato() {
		setIdade(0);
		setNome("Sem nome.");
		setCor("Gato sem cor");
	}
	
	//métodos
	public boolean isQuadrupede() {
		return quadrupede;
	}
	
	public void getQuadrupede() {
		return quadrupede;
	}
	
	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	
	@Override
	public void falar(){
		System.out.println("Miau Miau.");
	}
}
