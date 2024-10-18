package model;

public class Produto {
	
	/*
	 
	 1) Classe Produto:
Crie uma classe Produto com os atributos nome, preco e quantidade. 
Implemente métodos para definir e obter os valores dos atributos, 
bem como um método para calcular o valor total do estoque (preco * quantidade).
	 
	 
	 */

	private String nome ="";
	private double preco = 0.0;
	private int qtd = 0; //abreviado quantidade.
	
	// set e get
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	// calcular o valor total do estoque 
	
	// com parametro
	public double estoqueTotal(double preco, int qtd) {
		return (preco * qtd);
	}
	
}
