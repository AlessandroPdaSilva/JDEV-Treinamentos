package br.excelCSV;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LendoPlanilhaCSV {

	public static void main(String[] args) throws FileNotFoundException {

		// Ler arquivo --Tipo um FileReader
		FileInputStream lerArquivo = new FileInputStream(new File(
				"C:\\Users\\aless\\git\\repository\\JDEV-Treinamentos\\src\\br\\excelCSV\\MeuTexto.csv"));
		
		// Ler linha a linha
		Scanner scan = new Scanner(lerArquivo,"UTF-8");
		
		
		while(scan.hasNext()) {// so pra imprimir

			String linha = scan.nextLine();
			
			System.out.println(linha);
			
		}
		
		// split("\\;")
		
	}

}
