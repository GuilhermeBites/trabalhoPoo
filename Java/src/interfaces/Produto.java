package interfaces;

public interface Produto {
	//gets e sets
	public void setNomeProduto(String nomeProduto);
	public String getNomeProduto();
	public int getIdProduto();
	public void setIdProduto(int id);
	public void setValorProduto(double valor);
	public double getValorProduto();
	public void setQuantidadeProduto(int qtd);
	public int getQuantidadeProduto();
}
