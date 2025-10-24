package dev.ropimasi.curso.especialistajava.modulo12.aula15;

public record Holerite(String nomeFuncionario, String mesAno, double valorSalario) {

	public void imprimir() {
		System.out.println();
		System.out.println("Holerite de: " + nomeFuncionario());
		System.out.println("Mês/Ano: " + mesAno());
		System.out.printf("Valor do Salário: R$ %.2f%n", valorSalario());
	}

}
