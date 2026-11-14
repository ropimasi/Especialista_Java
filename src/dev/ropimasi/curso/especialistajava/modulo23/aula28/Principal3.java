package dev.ropimasi.curso.especialistajava.modulo23.aula28;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Principal3 {

	public static void main(String[] args) {
		ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
		
		// O offset do fuso horário depende de algumas regras políticas, econômicas e geográficas.
		// Por exemplo, aqui no Brasil existe o "horário de verão" que fas o offset variar.
		
		ZoneOffset offsetSaoPaulo1 = fusoSaoPaulo
				.getRules()
				.getOffset(LocalDateTime.parse("2018-02-17T00:00:00"));
		
		System.out.println(offsetSaoPaulo1);

		ZoneOffset offsetSaoPaulo2 = fusoSaoPaulo
				.getRules()
				.getOffset(LocalDateTime.parse("2018-02-18T00:00:00"));
		
		System.out.println(offsetSaoPaulo2);

		
		
	}

}
