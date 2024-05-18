package br.com.senaisp.bauru.Leo.Licao02;

public class Estudante {
		//Campos ou Fields ou variáveis de instância
		private int id;  //Private significa que o valor só irá ser alterado aqui dentro, para isso, é preciso usar um getter e setter aqui dentro e chamá-los no main para alterar aqui.
		private String nome;
		private String documento;
		private float media;
		private boolean fumante;
		private double bolsaEstudo;
		
		//Constructors
		//Constructor padrão - sem parâmetros
		public Estudante() {
			id = 0;
			nome = "Sem nome";
			documento = "Sem documento";
			media = 0.0f; //Esse f no final do 0.0 indica que o valor decimal é float, pois no java todos os valores decimais são considerados como double por padrão.
			fumante = false;
			bolsaEstudo = 0.0; //Aqui não colocou o f porque a variável "bolsaEstudos" é double.
		}
		
		//Contructors personalizados:
		public Estudante(int id, String nome, String documento, float media, double bolsa, boolean fum) {
			setId(id);
			setNome(nome);
			setDocumento(documento);
			setMedia(media);
			setBolsaEstudo(bolsa);
			setFumante(fum);
		}
		
		//getters e setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			if (nome.length() < 2) {
				throw new RuntimeException("Nome deve ter no mínimo 2 caracteres!");
			} else {
				this.nome = nome;
			}
		}

		public String getDocumento() {
			return documento;
		}

		public void setDocumento(String documento) {
			this.documento = documento;
		}

		public float getMedia() {
			return media;
		}

		public void setMedia(float media) {
			this.media = media;
		}

		public boolean isFumante() {
			return fumante;
		}

		public void setFumante(boolean fumante) {
			this.fumante = fumante;
		}

		public double getBolsaEstudo() {
			return bolsaEstudo;
		}

		public void setBolsaEstudo(double bolsaEstudo) {
			this.bolsaEstudo = bolsaEstudo;
		}
		
		//metodos
		@Override //Esse "@Override" é um comentário que serve para indicar que esta se sobreescrevendo o comando original. O código consegue funcionar normalmente sem ele.
		public String toString() {
			return  "Id: " + getId() + "\n" + "Nome: " + getNome() + "\n" + "Documento: " + getDocumento() + "\n" + "Media: " + getMedia() + "\n" + "Bolsa de Estudos: " + getBolsaEstudo() + "\n" + "Fumante: " + isFumante();
		}
		
}