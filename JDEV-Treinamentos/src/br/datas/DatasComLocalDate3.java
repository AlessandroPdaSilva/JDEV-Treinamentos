package br.datas;

import java.time.LocalDate;

public class DatasComLocalDate3 {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.of(2021, 05, 25);
		
		dataBase = dataBase.plusYears(2);
		dataBase = dataBase.minusMonths(3);
		
		System.out.println("A data base e :" + dataBase);
	}

}
