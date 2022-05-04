package br.datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasComLocalDate2 {

	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.of(2020, 04, 12);// da pra passar assim tmb("2020-04-12")
		LocalDate dataAtual = LocalDate.of(2022, 05, 03);
		
		System.out.println("Data antiga e antes da atual: " + dataAntiga.isBefore(dataAtual));
		System.out.println("Data antiga e igual a atual: "+ dataAntiga.isEqual(dataAtual));
		
		Period periodo = Period.between(dataAntiga, dataAtual);// periodo entre as datas
		
		System.out.println("O periodo entre um e outro e de "+periodo.getYears()+" anos e "+ periodo.getDays()
		+" dias");
	}

}
