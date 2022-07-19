package br.imd.lp2.projetofinal.excecoes;

public class LessThanZeroException extends Exception {

    @Override
    public String getMessage() {
        return "Valor não pode ser menor que zero";
    }

}
