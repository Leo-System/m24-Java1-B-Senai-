package br.com.senaisp.bauru.Leo.Licao02;

public class EstudanteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante est01 = new Estudante(); //criando uma variável recebendo as propriedades de estudante.
		
		//Colocando valores nas variáveis do objeto com seus setters.
		est01.setNome("Richard");
		est01.setId(1);
		est01.setMedia(5.5f);
		
		//mostrando valores
		System.out.println("Nome: " + est01.getNome());
		System.out.println("Documento: " + est01.getDocumento());
		
		//obtendo o objeto como representação textual:
		System.out.println(est01.toString() + "\n");
		
		//Criando um novo estudante com o contructor Estudante com umas variáveis por parâmetro (è o segundo constructor criado lá):
		Estudante est02 = new Estudante(2, "Roberto", "12345678900", 9.6f, 1600.00, true);
		
		//mostrando o estudante novo:
		System.out.println(est02.toString());
		
	}

}
