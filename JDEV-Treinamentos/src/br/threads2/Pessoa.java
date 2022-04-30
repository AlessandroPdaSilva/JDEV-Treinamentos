package br.threads2;

import java.util.Objects;

public class Pessoa {
	
	private String nome;
	private String email;
	
	
	public Pessoa(String nome,String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + "]";
	}
	
	
	
	
}
