package dev.ropimasi.curso.especialistajava.modulo21.aula03;

public class Max {

    public static void main(String[] args) {
        int x = 100;
        int y = 200;

//        int z = Math.max(x, y);
        int z = Integer.max(x, y);

        System.out.println(z);
    }

}