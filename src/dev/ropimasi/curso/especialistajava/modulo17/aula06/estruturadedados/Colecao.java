package dev.ropimasi.curso.especialistajava.modulo17.aula06.estruturadedados;

public interface Colecao<T> {

    void colocar(T item);
    T retirar();

}
