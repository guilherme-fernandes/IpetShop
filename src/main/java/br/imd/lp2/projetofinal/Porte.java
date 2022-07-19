package br.imd.lp2.projetofinal;

public enum Porte {

    PEQUENO ("pequeno"), MEDIO ("medio"), GRANDE ("grande");

    private String porte;

    Porte(String classificacao) {
        this.porte = porte;
    }

    public String getClassificacao() {
        return porte;
    }
}
