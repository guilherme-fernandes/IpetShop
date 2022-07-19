package br.imd.lp2.projetofinal;

public class Animal {

    protected int code;
    protected String classe;
    protected String nome;
    String raca;
    protected double tamanho;
    protected char sexo;
    protected double valor;


    public Animal(int code, String classe, String nome, String raca, double tamanho, char sexo, double valor) {
        this.code = code;
        this.nome = nome;
        this.raca = raca;
        this.tamanho = tamanho;
        this.sexo = sexo;
        this.valor = valor;
    }

}
