package dev.ropimasi.curso.especialistajava.modulo22.aula03;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		Date ontem = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));
		
		System.out.println("Ontem: " + ontem);
		System.out.println("Hoje: " + hoje);
		
		System.out.println(ontem.getTime());
		System.out.println(hoje.getTime());
		
		long diferencaMillis = hoje.getTime() - ontem.getTime();
		System.out.println("Diferença em milissegundos: " + diferencaMillis);
		
		double diferencaHoras = diferencaMillis / 1000 / 60 / 60;
		System.out.printf("Diferença em horas: %.2f%n", diferencaHoras);
		
		System.out.printf("Hoje é maior que ontem? %b%n", hoje.after(ontem));
		System.out.printf("Ontem é menor que hoje? %b%n", ontem.before(hoje));
		System.out.printf("Hoje é igual a ontem? %b%n", hoje.equals(ontem));
		System.out.printf("Comparando ontem com hoje: %d%n", ontem.compareTo(hoje));
		System.out.printf("Comparando hoje com ontem: %d%n", hoje.compareTo(ontem));

	}

}
