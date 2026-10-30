package dev.ropimasi.curso.especialistajava.modulo22.aula10;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;



public class GeradorParcelas {

	public static List<Date> gerarParcelas(Date primeiraParcela, int quantidadeParcelas) throws ParseException {
		List<Date> parcelas = new ArrayList<Date>();

		Calendar calendario = Calendar.getInstance();
		calendario.setTime(primeiraParcela);

		boolean ehUltimoDiaDoMes = extracted(calendario);

		parcelas.add(calendario.getTime());

		for (int i = 1; i < quantidadeParcelas; i++) {
			calendario.add(Calendar.MONTH, 1);
			if (ehUltimoDiaDoMes) {
				calendario.set(Calendar.DAY_OF_MONTH, calendario.getActualMaximum(Calendar.DAY_OF_MONTH));
			} else {
				Calendar calendario2 = Calendar.getInstance();
				calendario2.setTime(primeiraParcela);
				int diaOriginal = calendario2.get(Calendar.DAY_OF_MONTH);
				int ultimoDiaDoMes = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);

				if (diaOriginal > ultimoDiaDoMes) {
					calendario.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);
				} else {
					calendario.set(Calendar.DAY_OF_MONTH, diaOriginal);
				}
			}

			parcelas.add(calendario.getTime());
		}

		return parcelas;
	}


	protected static boolean extracted(Calendar calendario) {
		return calendario.get(Calendar.DAY_OF_MONTH) == calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

}
