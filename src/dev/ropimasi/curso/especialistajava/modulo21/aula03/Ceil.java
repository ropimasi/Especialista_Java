package dev.ropimasi.curso.especialistajava.modulo21.aula03;

public class Ceil {

    public static void main(String[] args) {
        double x = 300.1;
        double y = 300.9;

        System.out.println(Math.ceil(x));
        System.out.println(Math.ceil(y));
        System.out.println(Math.ceil(x) == Math.ceil(y));
    }

}