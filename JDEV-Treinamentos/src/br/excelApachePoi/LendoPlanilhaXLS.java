package br.excelApachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LendoPlanilhaXLS {

	public static void main(String[] args) throws Exception {

		// Ler arquivo --Tipo um FileReader
		FileInputStream lerArquivo = new FileInputStream(new File(
				"C:\\Users\\aless\\git\\repository\\JDEV-Treinamentos\\src\\br\\excelApachePoi\\MeuTexto.xls"));
		
		HSSFWorkbook excel = new HSSFWorkbook(lerArquivo);
		HSSFSheet planilha = excel.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while(linhaIterator.hasNext()) {
			
			Row linha = linhaIterator.next();// linha
			Iterator<Cell> celulas= linha.iterator();
			
			while(celulas.hasNext()) {
				Cell cell = celulas.next();//celula
				
				switch (cell.getColumnIndex()) {
				case 0:
					System.out.println(cell.getStringCellValue());// primeira celula
					break;
				case 1:
					System.out.println(cell.getStringCellValue());// segunda celula
					break;
				case 2:
					System.out.println(cell.getNumericCellValue());// terceira celula
					break;

				}
				
			}
			
			excel.close();
			
		}
		
	}

}
