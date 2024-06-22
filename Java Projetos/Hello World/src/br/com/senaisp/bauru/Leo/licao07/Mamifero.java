package br.com.senaisp.bauru.Leo.licao07;

public abstract class Mamifero {
	//Campos ou vzriáveies de intância ou fields.
	private String nome;
	private String cor;
	private int idade;
	//constructor
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//métodos
	public void falar() {
		System.out.println("Mamifero falando!");
	}
	
	@Override
	public String toString() {
		return "nome: " + nome + "\n" + "Cor: " + cor + "\n" + "Idade: " + idade + "\n";
	}
}
