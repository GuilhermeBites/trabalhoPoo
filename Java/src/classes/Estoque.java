package classes;

import interfaces.Produto;

public class Estoque {
	Produto[] estoqueLoja;
	int maxRange;
	int index;
	
	public Estoque(int tamMax) {
		this.estoqueLoja = new Produto[tamMax];
	}
	

	boolean isEmpty() {
		if(this.estoqueLoja.length == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	void addProduto(Produto novo) {
		if(this.maxRange == this.estoqueLoja.length) {
			System.out.println("Estoque cheio!");
		}else {
			for(Produto emEstoque : this.estoqueLoja) {
				if(emEstoque == novo) {
					System.out.println("Produto já cadastrado!");
					return;
				}
			}
			this.estoqueLoja[this.index] = novo;
			this.index++;
			System.out.println("Produto incluído com sucesso!");
		}
	}
	
	boolean retiraProduto(Produto aSerRetirado) {
		int i=0,index=0;
		boolean flag=false;
		if(this.isEmpty()) {
			System.out.println("O estoque está vazio!");
			return false;
		}
		for(Produto tmp : this.estoqueLoja) {
			if(tmp == aSerRetirado) {
				index = i;
				flag = true;
			}
			i++;
		}
		if(!flag) {
			return false;
		}else {
			this.estoqueLoja[index] = null;
			this.moveEstoque(index);
		}
		return true;
	}
	
	void moveEstoque(int index) {
		for(int i=index;i<this.estoqueLoja.length-1;i++) {
			this.estoqueLoja[i] = this.estoqueLoja[i+1];
		}
	}
}
