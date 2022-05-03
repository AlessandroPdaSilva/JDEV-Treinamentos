package br.datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
 
 

public class CalculandoDatas2 {

	public static void main(String[] args) {
		
		// Calcular datas (quanto tempo de uma data para outra)
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-04-21"), LocalDate.now());
		
		System.out.println(dias + " dias");
	}

}
