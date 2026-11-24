package dev.ropimasi.curso.especialistajava.modulo25.aula05.crm;

public interface Filtro<T> {

    boolean avaliarIdade(T objeto);
    boolean avaliarNomeContem(T objeto, String nomeParte);

}