package br.imd.lp2.projetofinal;

import java.util.LinkedList;
import java.util.List;

public class Ave extends Animal {

    //private double tamanhodobico;
    //private double envergaduraasa;

    public Ave(String classe, String nome, String raca, double tamanho, char sexo, double valor) {
        super(classe, nome, raca, tamanho, sexo, valor);
        //this.tamanhodobico = tamanhodobico;
        //this.envergaduraasa = envergaduraasa;
    }

    public String toString() {
        return "Code: " + code + "\tClasse: " + classe + "\traça: " + raca + "\ttamanho: " + tamanho + "\tSexo: " + sexo + "\tvalor: " + valor;
    }
}
