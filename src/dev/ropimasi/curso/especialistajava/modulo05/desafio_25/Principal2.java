package dev.ropimasi.curso.especialistajava.modulo05.desafio_25;
public class Principal2 {

    public static void main(String[] args) {
        Funcionario2 funcionario = new Funcionario2();
        funcionario.nome = "João da Silva";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho2 contratoTrabalho = new ContratoTrabalho2();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 51.8;
        contratoTrabalho.valorHoraExtra = 60.5;

        FolhaPagamento2 folhaPagamento = new FolhaPagamento2();

        double salarioDevido = folhaPagamento.calcularSalario(160, 10, contratoTrabalho);

        System.out.printf("Salário devido: R$ %.2f%n", salarioDevido);
    }

}
