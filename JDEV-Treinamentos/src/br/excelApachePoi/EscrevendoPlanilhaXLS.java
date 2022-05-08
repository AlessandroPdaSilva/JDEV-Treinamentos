package br.excelApachePoi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;


public class EscrevendoPlanilhaXLS {

	public static void main(String[] args) throws IOException {
		
		// arquivo
		File arquivo = new File(""
				+ "C:\\Users\\aless\\git\\repository\\JDEV-Treinamentos\\src\\br\\excelApachePoi\\MeuTexto.xls");

		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		
		HSSFWorkbook excel = new HSSFWorkbook(); 
		HSSFSheet planilha = excel.createSheet("Planilha pessoas"); // planilha
		
		
		//MONTANDO PLANILHA
		Row linha = planilha.createRow(0);// primeira linha
		
		Cell celNome = linha.createCell(0);// celula 1
		celNome.setCellValue("Joao Paulo");
		
		Cell celEmail = linha.createCell(1);
		celEmail.setCellValue("joao@gmail.com");// celula 2
		
		Cell celIdade = linha.createCell(2);// celula 3
		celIdade.setCellValue(22);
		
		
		
		linha = planilha.createRow(1);// segunda linha
		
		Cell celNome2 = linha.createCell(0);// celula 1
		celNome2.setCellValue("Maria de Souza");
		
		Cell celEmail2 = linha.createCell(1);
		celEmail2.setCellValue("maria@gmail.com");// celula 2
		
		Cell celIdade2 = linha.createCell(2);// celula 3
		celIdade2.setCellValue(30);
		
		
		
	
		//PLANILHA MONTADA
		FileOutputStream saida = new FileOutputStream(arquivo);
		excel.write(saida);
		saida.flush();
		saida.close();
		
		
		System.out.println("Planilha criada");
 
	}

}
