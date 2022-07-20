package br.imd.lp2.projetofinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class CadastrodeProdutos {

    private List<Produto> novosprodutos = new ArrayList<>();

    public List cadastramentoProdutosViaJson(String nomedoarquivo, List<Produto> produtos) {

        Gson gson = new Gson();

        try {
            BufferedReader myJson = new BufferedReader(new FileReader("src/main/resources/" + nomedoarquivo));
            Type type = new TypeToken<List<Produto>>(){}.getType();
            novosprodutos = gson.fromJson(myJson, type);

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!produtos.isEmpty()) {
            produtos.addAll(novosprodutos);
            return produtos;
        }

        return novosprodutos;
    }

    public List adicionarProduto(List<Produto> produtos, Produto p) {
        produtos.add(p);
        return produtos;
    }

    public List removerProduto(List<Produto> produtos, Produto p) {
        produtos.remove(p);
        return produtos;
    }

}
