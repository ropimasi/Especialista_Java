package dev.ropimasi.curso.especialistajava.modulo20.aula03;

public class Contains {

    public static void main(String[] args) {
        String nome1 = "João da Silva Souza";

        System.out.println(nome1.contains("Silva")); // true
        System.out.println(nome1.contains(" da Silva")); // true
        System.out.println(nome1.contains(" DA Silva")); // false
    }

}
