package dev.ropimasi.curso.especialistajava.modulo22.aula09;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Principal {

	public static void main(String[] args) {
		
		Calendar dataNascimentoJoao = new GregorianCalendar(1981, Calendar.SEPTEMBER, 22);
		Calendar dataNascimentoJose = new GregorianCalendar(1981, Calendar.SEPTEMBER, 22);
		
		if (dataNascimentoJoao.compareTo(dataNascimentoJose) == 0) {
			System.out.println("As datas de nascimento são iguais.");
		} else if (dataNascimentoJoao.compareTo(dataNascimentoJose) < 0) {
			System.out.println("João nasceu antes de José.");
		} else if (dataNascimentoJoao.compareTo(dataNascimentoJose) > 0) {
			System.out.println("João nasceu depois de José.");
		}
		
		if (dataNascimentoJoao.equals(dataNascimentoJose)) {
			System.out.println("As datas de nascimento são iguais.");
		} else if (dataNascimentoJoao.before(dataNascimentoJose)) {
			System.out.println("João nasceu antes de José.");
		} else if (dataNascimentoJoao.after(dataNascimentoJose)) {
			System.out.println("João nasceu depois de José.");
		}
		
	}

}
