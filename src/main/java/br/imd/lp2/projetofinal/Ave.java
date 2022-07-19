package br.imd.lp2.projetofinal;

public class Ave extends Animal {

    private double tamanhoDoBico;
    private double envergaduraAsa;

    public Ave(int code, String classe, String nome, String raca, double tamanho, char sexo, double valor, double tamanhoDoBico, double envergaduraDaAsa) {
        super(code, classe, nome, raca, tamanho, sexo, valor);
        this.tamanhoDoBico = tamanhoDoBico;
        this.envergaduraAsa = envergaduraDaAsa;
    }
}
