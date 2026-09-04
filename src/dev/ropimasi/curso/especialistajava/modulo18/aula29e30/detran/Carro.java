package dev.ropimasi.curso.especialistajava.modulo18.aula29e30.detran;

import java.util.Objects;



public class Carro {

	private final String placa;
	private final String modelo;


	public Carro(String placa, String modelo) {
		super();
		Objects.requireNonNull(placa, "Placa não pode ser nula");
		Objects.requireNonNull(modelo, "Modelo não pode ser nulo");
		this.placa = placa;
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public String getModelo() {
		return modelo;
	}


	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", modelo=" + modelo + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(placa);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(placa, other.placa);
	}

}
