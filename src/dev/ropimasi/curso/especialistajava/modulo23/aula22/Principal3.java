package dev.ropimasi.curso.especialistajava.modulo23.aula22;

import java.time.Month;



public class Principal3 {

	public static void main(String[] args) {
		// Métodos de instância da enumeração Month:
		System.out.println("Número do mês: " + Month.JANUARY.getValue());
		System.out.println("Ordem (index) do mês: " + Month.JANUARY.ordinal());
		System.out.println("'name' do mês: " + Month.JANUARY.name());
		System.out.println("'toString' do mês: " + Month.JANUARY.toString());
		System.out.println("Primeiro dia do mês no ano: " + Month.JULY.firstDayOfYear(false));
		System.out.println("Primeiro dia do mês no ano: " + Month.JULY.firstDayOfYear(true));
		System.out.println("Comprimento do mês: " + Month.JULY.length(false));
		System.out.println("Primeiro mês do trimestre: " + Month.MAY.firstMonthOfQuarter());

	}

}
