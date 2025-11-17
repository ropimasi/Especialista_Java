package dev.ropimasi.curso.especialistajava.modulo15.aula01;

public class Principal {

	public static void main(String[] args) {
		Notebook notebook = new Notebook("Macbook Pro i7 16Gb", 5d, 100d);

		Locacao locacaoPorHora = new LocacaoPorHora(notebook);
		double valorDevidoH = locacaoPorHora.calcularValorDevido(10);
		System.out.printf("Valor a pagar: R$%.2f%n", valorDevidoH);
	
		Locacao locacaoPorDia = new LocacaoPorDia(notebook);
		double valorDevidoD = locacaoPorDia.calcularValorDevido(10);
		System.out.printf("Valor a pagar: R$%.2f%n", valorDevidoD);
		
		Locacao locacaoPorHoraSeguroSantander = new LocacaoPorHoraSeguroSantander(notebook);
		double valorDevidoHSegSant = locacaoPorHoraSeguroSantander.calcularValorDevido(10);
		System.out.printf("Valor a pagar: R$%.2f%n", valorDevidoHSegSant);
		
		Locacao locacaoPorDiaSeguroSantander = new LocacaoPorDiaSeguroSantander(notebook);
		double valorDevidoDSegSant = locacaoPorDiaSeguroSantander.calcularValorDevido(10);
		System.out.printf("Valor a pagar: R$%.2f%n", valorDevidoDSegSant);
		
		Locacao locacaoPorHoraSeguroItau = new LocacaoPorHoraSeguroItau(notebook);
		double valorDevidoHSegItau = locacaoPorHoraSeguroItau.calcularValorDevido(10);
		System.out.printf("Valor a pagar: R$%.2f%n", valorDevidoHSegItau);
		
		Locacao locacaoPorDiaSeguroItau = new LocacaoPorDiaSeguroItau(notebook);
		double valorDevidoDSegItau = locacaoPorDiaSeguroItau.calcularValorDevido(10);
		System.out.printf("Valor a pagar: R$%.2f%n", valorDevidoDSegItau);
		
		
		
	}

}
