package dev.ropimasi.curso.especialistajava.modulo12.aula15;

public class Programador extends Funcionario {

	private double valorBonus;



	public Programador(String nome, double valorHora) {
		super(nome, valorHora);
	}



	public double getValorBonus() {
		return valorBonus;
	}



	public void setValorBonus(double valorBonus) {
		if (valorBonus < 0) {
            throw new IllegalArgumentException("Valor de bônus deve ser maior ou igual a 0");
        }
		this.valorBonus = valorBonus;
	}



	@Override
	protected double calcularSalario(int horasTrabalhadas) {
		double salarioBase = super.calcularSalario(horasTrabalhadas);
		return salarioBase + valorBonus;
	}



	@Override
	public String toString() {
		return "Programador [valorBonus=" + valorBonus + "] " + super.toString();
	}

}
