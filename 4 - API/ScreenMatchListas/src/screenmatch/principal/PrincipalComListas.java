package screenmatch.principal;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Homem Aranha", 2023);
        filme1.recebeAvaliacao(10);
        filme1.recebeAvaliacao(9.7);
        filme1.recebeAvaliacao(9.9);

        Filme filme2 = new Filme("Interstellar", 2014);
        filme2.recebeAvaliacao(9.9);
        filme2.recebeAvaliacao(7.5);
        filme2.recebeAvaliacao(8);
        filme2.recebeAvaliacao(6);

        Filme filme3 = new Filme("matrix", 2020);
        filme3.recebeAvaliacao(9);
        filme3.recebeAvaliacao(8.6);
        filme3.recebeAvaliacao(8.7);

        Serie you = new Serie("YOU", 2018);

        ArrayList<Titulo> assistidos = new ArrayList<>();
        assistidos.add(filme1);
        assistidos.add(filme2);
        assistidos.add(filme3);
        assistidos.add(you);

        for (Titulo item: assistidos) {
            System.out.println(item);
            if (item instanceof Filme filme){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Gustavo");
        buscaPorArtista.add("Bruno");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("ORDENADO:");
        System.out.println(buscaPorArtista);

        Collections.sort(assistidos);
        System.out.println("ASSISTIDOS ORDENADOS POR NOME");
        System.out.println(assistidos);
        assistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("ASSISTIDOS ORDENADOS POR DATA");
        System.out.println(assistidos);
    }
}
