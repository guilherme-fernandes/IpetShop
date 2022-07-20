package br.imd.lp2.projetofinal;

public class Produto {

    protected String nome;
    protected double valorcusto;
    protected double valorvenda;

    private final double porcentvenda = 2.1;

    public Produto(String nome, double valorcusto) {
        this.nome = nome;
        this.valorcusto = valorcusto;
        valorvenda = valorcusto * porcentvenda;
    }
}
