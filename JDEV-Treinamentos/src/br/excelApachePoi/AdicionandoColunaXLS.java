package br.excelApachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class AdicionandoColunaXLS {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\aless\\git\\repository\\JDEV-Treinamentos\\src\\br\\excelApachePoi\\MeuTexto.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook excel = new HSSFWorkbook(entrada);  
		HSSFSheet planilha = excel.getSheetAt(0);  
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while (linhaIterator.hasNext()) {
			Row linha = linhaIterator.next(); 
			
			int numeroCelulas = linha.getPhysicalNumberOfCells(); /*quantidade de celula*/
			
			Cell cell = linha.createCell(numeroCelulas); /*Cria nova celular na linha*/
			cell.setCellValue("5.487,20");
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		excel.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada");

	}

}
