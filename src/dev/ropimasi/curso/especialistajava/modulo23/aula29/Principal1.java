package dev.ropimasi.curso.especialistajava.modulo23.aula29;

import java.time.LocalDate;
import java.time.ZoneId;

public class Principal1 {

	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataAtualLosAngeles = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		LocalDate dataAtualJapao = LocalDate.now(ZoneId.of("Japan"));
		LocalDate dataAtualExtremoOriente = LocalDate.now(ZoneId.of("+11:00") );
		
		
		System.out.println(dataAtual);
		System.out.println(dataAtualLosAngeles);
		System.out.println(dataAtualJapao);
		System.out.println(dataAtualExtremoOriente);

	}

}
