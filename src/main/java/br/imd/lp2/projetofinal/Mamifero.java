package br.imd.lp2.projetofinal;
import br.imd.lp2.projetofinal.excecoes.LessThanZeroException;

import java.util.LinkedList;
import java.util.List;

public class Mamifero extends Animal {

    //private String corpelo;
    private String porte;

    public Mamifero(String classe, String nome, String raca, double tamanho, char sexo, double valor) throws LessThanZeroException {

        super(classe, nome, raca, tamanho, sexo, valor);

        //this.corpelo = corpelo;

        if (this.tamanho >= 0.0 && this.tamanho <= 1.00)
            this.porte = Porte.PEQUENO.getClassificacao();


        else if (this.tamanho <= 1.85) {
            this.porte = Porte.MEDIO.getClassificacao();
        }

        else {
            this.porte = Porte.GRANDE.getClassificacao();
        }

        if (this.tamanho < 0.0) {
            throw new LessThanZeroException();
        }
    }

    public String toString() {
        return "Code: " + code + "\tClasse: " + classe + "\traça: " + raca + "\ttamanho: " + tamanho + "\tSexo: " + sexo + "\tvalor: " + valor + "porte: " + porte;
    }
}
