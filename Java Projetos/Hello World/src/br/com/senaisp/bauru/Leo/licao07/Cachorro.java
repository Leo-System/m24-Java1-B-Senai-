package br.com.senaisp.bauru.Leo.licao07;

public class Cachorro extends Mamifero{
	private boolean quadrupede;
	
	private boolean isQuadrupede() {
		return quadrupede;
	}
	
	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	
	public void falar() {
		System.out.println("Au Au Au!");
	}
	
	@Override
	public String toString() {
		return super.toString() + "Quadrupede: " + quadrupede + "\n";
	}
}
