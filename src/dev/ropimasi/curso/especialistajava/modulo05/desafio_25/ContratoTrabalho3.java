package dev.ropimasi.curso.especialistajava.modulo05.desafio_25;
public class ContratoTrabalho3 {

    Funcionario3 funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean possuiAdicionalParaFilhos() {
        return funcionario.possuiFilhos();
    }

}
