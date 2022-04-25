package br.interfaces;

public class Login implements PermitirAcesso{
	
	private String nome;
	private String senha;
	
	
	
	@Override
	public Boolean autenticar(String login,String senha) {
		
		return login.equals("adm") && senha.equals("adm");
	}

	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
