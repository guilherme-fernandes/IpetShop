package br.imd.lp2.projetofinal;

public class Produto {

    protected String nome;
    protected double valorcusto;
    private final double porcentvenda = 2.1;
    protected double valorvenda;

    public Produto(String nome, double valorcusto) {
        this.nome = nome;
        this.valorcusto = valorcusto;
        this.valorvenda = valorcusto * porcentvenda;
    }

    public void calcularValorVenda() {
        valorvenda = valorcusto * porcentvenda;
    }

    public String toString() {
        return "Produto: " + nome + " | Valor de custo: " + valorcusto + " | Valor de venda: " + valorvenda;
    }
}
