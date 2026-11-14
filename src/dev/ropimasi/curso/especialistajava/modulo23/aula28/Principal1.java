package dev.ropimasi.curso.especialistajava.modulo23.aula28;

import java.time.ZoneId;

public class Principal1 {

	public static void main(String[] args) {
		ZoneId region1 = ZoneId.systemDefault();
		System.out.println(region1);
		System.out.println(region1.getClass());
		
		ZoneId region2 = ZoneId.of("America/Los_Angeles");
		System.out.println(region2);
		System.out.println(region2.getClass());

		System.out.println("--------");
		
		for (String zoneId : ZoneId.getAvailableZoneIds()) {
			System.out.println(zoneId);
		}
		
		
		
	}

}
