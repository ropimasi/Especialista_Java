package dev.ropimasi.curso.especialistajava.modulo12.aula15;

public class Principal {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Joao", 50);
		Holerite holerite1 = funcionario1.gerarHolerite(160, "11/2025");
		holerite1.imprimir();

		System.out.println("-------------------------");

		Programador programador1 = new Programador("Ronaldo", 100);
		programador1.setValorBonus(1500);
		Holerite holerite2 = programador1.gerarHolerite(160, "11/2025");
		holerite2.imprimir();

	}
}
