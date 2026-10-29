package dev.ropimasi.curso.especialistajava.modulo22.aula08;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		System.out.println(calendario.getTime());
		
		calendario.set(Calendar.DAY_OF_MONTH, 20);
		System.out.println(calendario.getTime());
		
		int ultimoDiaDoMes = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendario.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);
		System.out.println(calendario.getTime());
		
		calendario.set(Calendar.MONTH, Calendar.DECEMBER);
		ultimoDiaDoMes = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendario.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);
		System.out.println(calendario.getTime());
		
		calendario.add(Calendar.MONTH, 2);
		ultimoDiaDoMes = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendario.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);
		System.out.println(calendario.getTime());
		
		calendario.add(Calendar.MONTH, -5);
		ultimoDiaDoMes = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendario.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);
		System.out.println(calendario.getTime());
	}

}
