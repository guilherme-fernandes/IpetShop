package br.imd.lp2.projetofinal;

import java.util.List;

public class Animal {

    protected String classe;
    protected String nome;
    String raca;
    protected double tamanho;
    protected char sexo;
    protected double valor;
    protected double valorvenda;

    protected final double porcentvenda = 2.1;


    public Animal(String classe, String nome, String raca, double tamanho, char sexo, double valor) {
        this.classe = classe;
        this.nome = nome;
        this.raca = raca;
        this.tamanho = tamanho;
        this.sexo = sexo;
        this.valor = valor;
        this.valorvenda = valorvenda * porcentvenda;
    }

}
