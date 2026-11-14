package dev.ropimasi.curso.especialistajava.modulo23.aula28;

import java.time.ZoneId;
import java.time.ZoneOffset;

public class Principal2 {

	public static void main(String[] args) {
		ZoneId offset1 = ZoneId.of("-03:00");
		System.out.println(offset1);
		System.out.println(offset1.getClass());
		
		ZoneId offset2 = ZoneOffset.UTC;
		System.out.println(offset2);
		System.out.println(offset2.getClass());
		
		// As três chamadas resultam no mesmo valor.
		ZoneId offset3 = ZoneId.of("-03:00");
		ZoneId offset4 = ZoneOffset.of("-03:00");
		ZoneOffset offset5 = ZoneOffset.of("-03:00");
		ZoneOffset offset6 = ZoneOffset.ofHours(-3);
		
		System.out.println(offset3);
		System.out.println(offset4);
		System.out.println(offset5);
		System.out.println(offset6);
		
	}

}
