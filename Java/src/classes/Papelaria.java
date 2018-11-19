package classes;

import interfaces.Produto;

public class Papelaria implements Produto {
	//variaveis
	String tipo;
	String fabricante;
	int id;
	double valor;
	int quantidade;
	
	//gets e sets
	public void setNomeProduto(String nome) {
		this.tipo = nome;
	}
	
	public String getNomeProduto() {
		return this.tipo;
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
