package br.imd.lp2.projetofinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import br.imd.lp2.projetofinal.excecoes.AnimalClassUnknown;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class CadastrodeAnimais {

    public List<Animal> novosanimais = new ArrayList<>();
    public List<Mamifero> estoqueMamifero = new ArrayList<>();
    public List<Ave> estoqueAves = new ArrayList<>();
    public List<Peixe> estoquePeixe = new ArrayList<>();

    public void cadastramentoViaJson(String nomedoarquivo) throws AnimalClassUnknown {

        Gson gson = new Gson();

        try {
            BufferedReader myJson = new BufferedReader(new FileReader("src/main/resources/" + nomedoarquivo));
            Type type = new TypeToken<List<Animal>>(){}.getType();
            novosanimais = gson.fromJson(myJson, type);

        } catch (IOException e) {
            e.printStackTrace();
        }

        adicionarAnimaisClasses();

    }

    private void adicionarAnimaisClasses() {

        for(Animal a : novosanimais) {

            if (a.classe.equals("Mamifero")) {
                estoqueMamifero.add((Mamifero)a);
            }

            else if (a.classe.equals("Ave")) {
                estoqueAves.add((Ave)a);
            }

            else if (a.classe == "Peixe") {
                estoquePeixe.add((Peixe)a);
            }

        //    else {
        //        throw new AnimalClassUnknown();
        //    }
        }
        novosanimais.clear();
    }
}
