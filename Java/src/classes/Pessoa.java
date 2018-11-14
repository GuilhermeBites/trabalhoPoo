package classes;

public abstract class Pessoa {
	//variaveis
	String nome;
	int idPessoa;
	String login;
	protected String senha;
	//
	
	//gets e sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public boolean verificaSenha(String senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
}
