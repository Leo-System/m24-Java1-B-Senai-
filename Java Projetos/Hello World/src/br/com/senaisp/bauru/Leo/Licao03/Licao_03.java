package br.com.senaisp.bauru.Leo.Licao03;

public class Licao_03 {
	
	public static int _idade = 18;
	
	public static void main(String[] args) {
		byte vByte = 127;
		
		vByte++;//Estourando o limite do byte.
		
		System.out.println(vByte);//Mostrando o valor estourado do vByte.
		
		float vFloat = 6_000.00f;//A underline no número é ignorada pelo compilador e só serve para visualização do programador. 
		//O f no final do número acima indica que ele é float, pois qualquer número decimal é considerado double por padrão no java.
		
		if (vByte == -128) {
			String nome = "Richard";
			System.out.println("Meu nome é: " + nome);
		}
		//System.out.println(nome);//Aqui o nome da erro porque ele só existe dentro do if, que é onde ele foi criado.
		
		//alterando o valor de idade:
		_idade = 20;
		int idade = 50;//Como aqui foi criada uma variável local, o sistema n]ao usa mais a "idade" global, mas sim a local.
		//Lembre-se de especificar o nome das variáveis globais, como colocar um underline na frente dos nomes das variáveis globais.
		System.out.println(idade);
		idade += 20;//Adicionando mais 20 na idade.
		System.out.println(idade);
		

	}

}
