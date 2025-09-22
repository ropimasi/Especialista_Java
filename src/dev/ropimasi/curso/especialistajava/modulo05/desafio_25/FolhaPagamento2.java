package dev.ropimasi.curso.especialistajava.modulo05.desafio_25;
public class FolhaPagamento2 {

    double calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho2 contrato) {
        double valorHorasNormais = horasNormais * contrato.valorHoraNormal;
        double valorHorasExtras = horasExtras * contrato.valorHoraExtra;

        double valorTotal = valorHorasNormais + valorHorasExtras;

        if (contrato.possuiAdicionalParaFilhos()) {
            valorTotal *= 1.10;
        }

        return valorTotal;
    }

}
