package dev.ropimasi.curso.especialistajava.modulo22.aula01e02;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		Date data = new Date(); // Data referente ao momento atual do sistema.
//		Date data = new Date(0); // Marco inicial da contagem de tempo nesta classe: 00:00h 01/01/1970 UTC.
//		Date data = new Date(900_000_000_000L); // Data referente a 900_000_000_000 milissegundos após o marco inicial da contagem de tempo nesta classe.
//		Date data = new Date( System.currentTimeMillis() ); // Data referente ao momento atual do sistema. );
//		Date data = new Date( System.currentTimeMillis() + 3_600_000 ); // Data referente a 1 hora após o momento atual do sistema.
//		Date data = new Date( System.currentTimeMillis() - (24 * 60 * 60 * 1000) ); // Data referente a 1 dia antes do momento atual do sistema.
		
		System.out.println(data);
		
		System.out.println(data.getTime()); // Retorna o número de milissegundos desde o marco inicial da contagem de tempo nesta classe.
		System.out.println(data.getDate()); // DEPRECIADO: Retorna o dia do mês representado por esta data. O valor retornado é um inteiro entre 1 e 31.
		System.out.println(data.getDay()); // DEPRECIADO: Retorna o dia da semana representado por esta data. O valor retornado é um inteiro entre 0 e 6.
		System.out.println(data.getMonth()); // DEPRECIADO: Retorna o mês representado por esta data. O valor retornado é um inteiro entre 0 e 11.
		System.out.println(data.getYear()); // DEPRECIADO: Retorna o ano representado por esta data. O valor retornado é um inteiro que representa o ano menos 1900.
		
	}
	
	
}
