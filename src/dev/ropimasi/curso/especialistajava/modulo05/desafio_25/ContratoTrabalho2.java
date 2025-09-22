package dev.ropimasi.curso.especialistajava.modulo05.desafio_25;
public class ContratoTrabalho2 {

    Funcionario2 funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean possuiAdicionalParaFilhos() {
        return funcionario.possuiFilhos();
    }

}
