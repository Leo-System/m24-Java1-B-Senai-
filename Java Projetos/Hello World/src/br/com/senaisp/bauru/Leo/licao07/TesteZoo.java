package br.com.senaisp.bauru.Leo.licao07;

public class TesteZoo {

	public static void main(String[] args) {
		Cachorro mam = new Cachorro();
		mam.setCor("Caramelo");
		mam.setNome("Totó");
		mam.setIdade(3);
		
		//testa se o mam é cachorro:
		if(mam instanceof Cachorro) {
			((Cachorro) mam).setQuadrupede(true);			
		}
		
		mam.falar();
		System.out.println(mam.toString());
	}

}
