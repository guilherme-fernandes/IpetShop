package br.imd.lp2.projetofinal;

import java.util.List;

public class Animal {

    protected int code = 0;
    protected String classe;
    protected String nome;
    String raca;
    protected double tamanho;
    protected char sexo;
    protected double valor;


    public Animal(String classe, String nome, String raca, double tamanho, char sexo, double valor) {
        code = code + 1;
        this.nome = nome;
        this.raca = raca;
        this.tamanho = tamanho;
        this.sexo = sexo;
        this.valor = valor;
    }

}
