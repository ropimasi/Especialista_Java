package dev.ropimasi.curso.especialistajava.modulo23.aula14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraParcelas {

	public List<LocalDate> calcular(LocalDate primeiraParcela, int quantidadeParcelas) {
		List<LocalDate> datasParcelas = new ArrayList<>();
		
		datasParcelas.add(primeiraParcela);
		
		for (int i = 1; i < quantidadeParcelas; i++) {
			datasParcelas.add(primeiraParcela.plusMonths(i));
		}
		
		return datasParcelas;
	}
	
	
	
	
}
