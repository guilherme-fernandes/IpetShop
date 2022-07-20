package br.imd.lp2.projetofinal;

public class Menu {

    public static void main(String args[]) {

        /*
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
         */

        Produto p1 = new Produto("Brinqueto gato vareta", 10.95);
        Produto p2 = new Produto("Coleira Zee-dog", 45.50);

        CadastroEVendaDeProdutos cadastroprodutos = new CadastroEVendaDeProdutos();

        cadastroprodutos.adicionarProduto(p1);

        cadastroprodutos.cadastramentoProdutosViaJson("CadastroProdutos.json");

        cadastroprodutos.finalizarCompra();

        cadastroprodutos.adicionarProduto(p2);

        cadastroprodutos.imprimeEstoque();

    }
}