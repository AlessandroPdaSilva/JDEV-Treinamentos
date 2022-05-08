package br.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class LendoJson {

	public static void main(String[] args) throws FileNotFoundException {
		 
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		FileReader arquivoJson = new FileReader(// arquivo JSON
				"C:\\Users\\aless\\git\\repository\\JDEV-Treinamentos\\src\\br\\json\\MeuArquivo.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(arquivoJson);// passando para JsonArray
		
		for(JsonElement aux: jsonArray) {
			
			Usuario u = new Gson().fromJson(aux, Usuario.class);// converte para classe Usuario
			usuarios.add(u);
		}
		
		
		// IMPRIMIR
		for(Usuario u: usuarios) {
			System.out.println(u);
		}
		
	}

}
