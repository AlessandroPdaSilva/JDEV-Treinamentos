package br.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasComLocalDate {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		LocalTime hora = LocalTime.now();
		LocalDateTime dataHora = LocalDateTime.now();
		
		
		
		System.out.println("Data: "+data);
		System.out.println("Hora: "+hora);
		System.out.println("Hora: "+dataHora);
		System.out.println("Data formatada: "+ data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
	}

}
