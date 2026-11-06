package dev.ropimasi.curso.especialistajava.modulo23.aula16;

import java.time.LocalDate;
import java.time.Period;

public class Principal2 {

	public static void main(String[] args) {
		Period tempoMedioEntrega = Period.parse("P1M5D");
		LocalDate dataCompra = LocalDate.now();
		LocalDate dataPrevistoEntrega = dataCompra.plus(tempoMedioEntrega);
		
		System.out.println("Data da compra: " + dataCompra);
		System.out.println("Data prevista para entrega: " + dataPrevistoEntrega);
		
		LocalDate dataPrevistaCompra = dataPrevistoEntrega.minus(tempoMedioEntrega);
		System.out.println("Data prevista para compra: " + dataPrevistaCompra);
		

	}

}
