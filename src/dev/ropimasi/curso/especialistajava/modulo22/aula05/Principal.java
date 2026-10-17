package dev.ropimasi.curso.especialistajava.modulo22.aula05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		String dataTexto = "2024-06-13";
		DateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
		Date data = null;
		
		try {
			data = formatador.parse(dataTexto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(data);
		System.out.println(formatador.format(data));


		dataTexto = "2026-10-17 16:30:00";
		formatador = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			data = formatador.parse(dataTexto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(data);
		System.out.println(formatador.format(data));
		
		
	}

}
