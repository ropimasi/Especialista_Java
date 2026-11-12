package dev.ropimasi.curso.especialistajava.modulo23.aula22;

import java.time.LocalDate;
import java.time.Month;



public class Principal2 {

	public static void main(String[] args) {
		// Calculos com enumeração Month:
		Month mesAtual = LocalDate.now().getMonth();
		System.out.println("Mês atual: " + mesAtual);
		
		Month mesCalculado = mesAtual.plus(2);
		System.out.println("Mês calculado: " + mesCalculado);
		
		

	}

}
