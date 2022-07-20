package br.imd.lp2.projetofinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class CadastroEVendaDeProdutos {

    protected List<Produto> estoqueprodutos = new ArrayList<>();

    public void cadastramentoProdutosViaJson(String nomedoarquivo) {

        Gson gson = new Gson();
        List<Produto> produtoaux = new LinkedList<>();

        try {
            BufferedReader myJson = new BufferedReader(new FileReader("src/main/resources/" + nomedoarquivo));
            Type type = new TypeToken<List<Produto>>(){}.getType();
            produtoaux = gson.fromJson(myJson, type);
            produtoaux.forEach(produto -> {produto.calcularValorVenda();});

        } catch (IOException e) {
            e.printStackTrace();
        }

        estoqueprodutos.addAll(produtoaux);
    }

    public void adicionarProduto(Produto p) {
        estoqueprodutos.add(p);
    }

    public void removerProduto(Produto p) {
        estoqueprodutos.remove(p);
    }

    public void imprimeEstoque() {
        estoqueprodutos.forEach(produto -> {System.out.println(estoqueprodutos.indexOf(produto) + " - " + produto);});
    }

    private List adicionarCarrinho() {

        List<Produto> carrinho = new ArrayList<>();
        int opcao;

        System.out.println("Qual produto deseja adicionar ao carrinho? \n");

        imprimeEstoque();

        System.out.print("Inserir codigo do produto para comprar: ");
        Scanner dados = new Scanner(System.in);
        int codigo = dados.nextInt();
        System.out.println();

        carrinho.add(estoqueprodutos.get(codigo));

        System.out.print("Deseja continuar comprando? Digite 1 para sim e 2 para não: ");
        opcao = dados.nextInt();
        System.out.println();

        while (opcao == 1) {
            System.out.print("Inserir codigo do produto para comprar: ");
            codigo = dados.nextInt();
            System.out.println();

            carrinho.add(estoqueprodutos.get(codigo));

            System.out.print("Deseja continuar comprando? Digite 1 para sim e 2 para não: ");
            opcao = dados.nextInt();
            System.out.println();

        }
        return carrinho;
    }

    public void finalizarCompra () {

        List<Produto> produtosselecionados = adicionarCarrinho();

        estoqueprodutos.removeAll(produtosselecionados);
    }

}
