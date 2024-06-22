package br.com.senaisp.bauru.Leo.licao07;

public class Gato extends Mamifero{
	private boolean quadrupede;
	
	public boolean isQuadrupede() {
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
