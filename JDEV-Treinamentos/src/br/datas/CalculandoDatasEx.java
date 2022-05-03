package br.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculandoDatasEx {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
		
		Date data = formatarData.parse("05/06/2022");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
	
		for(int i = 1; i < 12; i++) {
			
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela "+ i + " vencimento na data: "+ formatarData.format(calendar.getTime()));
		}

	}

}
