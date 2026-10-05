package dev.ropimasi.curso.especialistajava.modulo21.aula06;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Principal {

	public static void main(String[] args) {
		
		BigDecimal x = new BigDecimal("10.0");
		BigDecimal y = new BigDecimal("2.0");
		BigDecimal z = x.divide(y);
		System.out.println(z);
		
		
		x = new BigDecimal("10.0");
		y = new BigDecimal("3.0");
		z = x.divide(y, 4, RoundingMode.HALF_EVEN);
		System.out.println(z);
		
		x = new BigDecimal("10.0");
		y = new BigDecimal("3.1");
		z = x.divide(y, 4, RoundingMode.HALF_EVEN);
		System.out.println(z);
		
		// RoundingMode.HALF_EVEN é o modo de arredondamento "banco",
		// que arredonda para o número par mais próximo quando o número
		// está exatamente no meio entre dois números. Por exemplo, 2.5
		// será arredondado para 2, enquanto 3.5 será arredondado para 4.
		// 2.524 = 2.52
		// 2.526 = 2.53
		// 2.525 = 2.53
		// 2.425 = 2.42
		
	}

}
