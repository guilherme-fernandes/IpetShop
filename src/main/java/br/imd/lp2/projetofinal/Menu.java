package br.imd.lp2.projetofinal;

import br.imd.lp2.projetofinal.excecoes.AnimalClassUnknown;

public class Menu {

    public static void main (String args[]) {

        CadastrodeAnimais cadastro = new CadastrodeAnimais();

        try {
            cadastro.cadastramentoViaJson("CadastroAnimais.json");
        } catch (AnimalClassUnknown e) {
            e.printStackTrace();
        }

        for (Mamifero mamifero : cadastro.estoqueMamifero) {
            System.out.println(mamifero);
        }

        cadastro.estoqueAves.forEach(ave -> { System.out.println(ave);});
    }
}
