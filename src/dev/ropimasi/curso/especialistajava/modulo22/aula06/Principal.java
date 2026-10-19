package dev.ropimasi.curso.especialistajava.modulo22.aula06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class Principal {

	public static void main(String[] args) {

		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		//		Calendar calendario = Calendar.getInstance();
//		Calendar calendario = new GregorianCalendar(1980, Calendar.JULY, 25);
		Calendar calendario = new GregorianCalendar(1980, Calendar.JULY, 25, 14, 35, 50);
		Date data = calendario.getTime();

		System.out.println(formatador.format(data));
		
		
	}

}
