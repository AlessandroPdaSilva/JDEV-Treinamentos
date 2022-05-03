package br.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculandoDatas {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();// calendar
		
		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("22/03/2022"));// setando Data
		
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));// dia atual
		
		
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));// dia atual + 5
		
	}

}
