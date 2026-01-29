package dev.ropimasi.curso.especialistajava.modulo17.aula05.estruturadedados;

public interface Colecao<T> {

    void colocar(T item);
    T retirar();

}
