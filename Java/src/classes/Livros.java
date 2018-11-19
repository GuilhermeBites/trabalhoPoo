package classes;

import interfaces.Produto;

public class Livros implements Produto {
	//variaveis
	String titulo;
	String autor;
	int id;
	String editora;
	String genero;
	double valor;
	int quantidade;
	
	//gets e sets
	public void setNomeProduto(String nome) {
		this.titulo = nome;
	}
	public String getNomeProduto() {
		return this.titulo;
	}
	public void setIdProduto(int id) {
		this.id = id;
	}
	public int getIdProduto() {
		return this.id;
	}
	public void setValorProduto(double valor) {
		this.valor = valor;
	}
	public double getValorProduto() {
		return this.valor;
	}
	public void setQuantidadeProduto(int qtd) {
		this.quantidade = qtd;
	}
	public int getQuantidadeProduto() {
		return this.quantidade;
	}
	
	
	
}
