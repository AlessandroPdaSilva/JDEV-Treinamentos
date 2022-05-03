package br.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CompararDatas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");// formatador de data
		
		Calendar calendar = Calendar.getInstance();// calendario
		
		Date dataAtual = calendar.getTime();
		
		Date dataVencimentoBoleto = formatarData.parse("22/06/2023");
		
		if(dataAtual.before(dataVencimentoBoleto)) {
			System.out.println("Boleto esta no prazo");
		}else {
			System.out.println("BOLETO ESTA VENCIDO!!");
		}
		
		
	}

}
