package br.imd.lp2.projetofinal;

public enum ClassificaManejo {

    NATIVO ("nativo"), EXOTICO ("exotico"), DOMESTICO ("domestico");

    private String classificacao;

    ClassificaManejo(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }
}
