package br.txt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoTxt {

	public static void main(String[] args) throws IOException {
		
		// arquivo
		File arquivo = new File("C:\\Users\\aless\\git\\repository\\JDEV-Treinamentos\\src\\br\\txt\\MeuTexto.txt");

		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		
		FileWriter escrever = new FileWriter(arquivo);// escrita		
		escrever.write("Que a forca esteja com voce!! 1 \n");
		escrever.write("Que a forca esteja com voce!! 2 \n");
		escrever.write("Que a forca esteja com voce!! 3 \n");
		
		escrever.flush();
		escrever.close();
		
		
		
		
		
	}

}
