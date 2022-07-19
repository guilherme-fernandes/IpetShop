package br.imd.lp2.projetofinal.excecoes;

public class AnimalClassUnknown extends Exception {

    @Override
    public String getMessage() {
        return "A classe informada no arquivo não e suportada";
    }
}
