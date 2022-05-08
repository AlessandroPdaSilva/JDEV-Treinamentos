package br.json;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {
	
	private String nome;
	private String email;
	private int idade;
	
	
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(email, idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && idade == other.idade && Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}
	
	
	
	
}
