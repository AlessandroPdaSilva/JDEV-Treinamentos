package br.excelCSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoPlanilhaCSV {

	public static void main(String[] args) throws IOException {
		
		// arquivo
		File arquivo = new File(""
				+ "C:\\Users\\aless\\git\\repository\\JDEV-Treinamentos\\src\\br\\excelCSV\\MeuTexto.csv");

		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		
		FileWriter escrever = new FileWriter(arquivo);// escrita		
		escrever.write("Joao Pedro;joao@gmail.com;22\n");
		escrever.write("Marcos Vinicius;marcos@gmail.com;37\n");
		escrever.write("Marcileia Souza;marcielia@gmail.com;54\n");
		
		escrever.flush();
		escrever.close();
		
		
				
				
		

	}

}
