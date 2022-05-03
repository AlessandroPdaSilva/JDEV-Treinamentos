package br.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClasseDate {

	public static void main(String[] args) {
		
		Date date = new Date();// data
		SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");// formata data para string
		
		 
		String texto = formatarData.format(date);
		
		
		System.out.println(texto);
		
	}

}
