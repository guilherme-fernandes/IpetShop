package br.imd.lp2.projetofinal;
import br.imd.lp2.projetofinal.excecoes.LessThanZeroException;

public class Mamifero extends Animal {

    private String cor_pelo;
    private String porte;

    public Mamifero(int code, String classe, String nome, String raca, double tamanho, char sexo, double valor, String cor_pelo, Porte porte) throws LessThanZeroException {
        super(code, classe, nome, raca, tamanho, sexo, valor);

        this.cor_pelo = cor_pelo;

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
}
