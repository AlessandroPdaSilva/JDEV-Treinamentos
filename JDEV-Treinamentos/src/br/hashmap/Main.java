package br.hashmap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		/* hashmap<k,v> e praticamente uma lista, a diferenca e que e personalizada
		 * K = Key unica
		 * V = Valor da Key*/
		
		// PRIMEIRO EXEMPLO
		HashMap<Integer, String> alunos = new HashMap<Integer, String>();
		
		alunos.put(25,"Maria");
		alunos.put(135,"Fernando");
		
		System.out.println("PRIMEIRO EXEMPLO: "+alunos.toString());
		
		
		// SEGUNDO EXEMPLO
		HashMap<String, String> funcionarios = new HashMap<String, String>();
		
		funcionarios.put("Gerente", "Carlos");
		funcionarios.put("Faxineira", "Denise");
		
		
		System.out.println("SEGUNDO EXEMPLO: "+funcionarios.toString());
		
		

	}

}
