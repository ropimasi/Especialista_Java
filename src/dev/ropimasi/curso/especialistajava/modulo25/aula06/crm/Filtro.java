package dev.ropimasi.curso.especialistajava.modulo25.aula06.crm;

public interface Filtro<T> {

    boolean avaliarIdade(T objeto);
    boolean avaliarNomeContem(T objeto, String nomeParte);

}