package br.json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscrevendoJson {

	public static void main(String[] args) throws IOException {
		
		Usuario u1 = new Usuario();
		Usuario u2 = new Usuario();
		
		u1.setNome("Joao Pedro");
		u1.setEmail("joao@gmail.com");
		u1.setIdade(25);
		
		
		u2.setNome("Maria da Silva");
		u2.setEmail("maria@gmail.com");
		u2.setIdade(38);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(u1);
		usuarios.add(u2);
		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String texto = gson.toJson(usuarios);// converte para Json
		
		
		
		
		// ESCREVENDO EM UM ARQUIVO
		
		FileWriter arquivoJson = new FileWriter(
				"C:\\Users\\aless\\git\\repository\\JDEV-Treinamentos\\src\\br\\json\\MeuArquivo.json");
		
		
		arquivoJson.write(texto);
		arquivoJson.flush();
		arquivoJson.close();
		
		System.out.println(texto);
	}

}




/** OBS:
	OutputStreamWriter nome = new OutputStreamWriter(new FileOutputStream(arquivo),"UTF-8"); 
	caso tenha erro de acentuação ***/ 

