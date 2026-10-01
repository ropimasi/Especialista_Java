package dev.ropimasi.curso.especialistajava.modulo21.aula03;

public class Abs {

    public static void main(String[] args) {
        float x = -300.5f;
        float y = 300.5f;

        System.out.println(Math.abs(x));
        System.out.println(Math.abs(y));
        System.out.println(Math.abs(x) == Math.abs(y));
    }

}