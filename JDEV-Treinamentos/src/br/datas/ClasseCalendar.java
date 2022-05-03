package br.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClasseCalendar {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();// calendar
		SimpleDateFormat formatarData = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");// formata data para string
		
		String texto = formatarData.format(calendar.getTime());
		
		System.out.println(texto);
		
	}

}
