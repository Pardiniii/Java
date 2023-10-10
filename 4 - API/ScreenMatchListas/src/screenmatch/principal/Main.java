package screenmatch.principal;

import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //FILMES

        Filme filme1 = new Filme("Homem Aranha", 2023);
        filme1.setInlcuidoNoPlano(true);
        filme1.setDuracaoEmMinutos(120);
        filme1.recebeAvaliacao(10);
        filme1.recebeAvaliacao(9.7);
        filme1.recebeAvaliacao(9.9);

        //filme1.exibeFicha();
        filme1.recebeAvaliacao(8.9);
        filme1.recebeAvaliacao(9.5);
        filme1.recebeAvaliacao(10);

        Filme filme2 = new Filme("Interstellar", 2014);
        filme2.setDuracaoEmMinutos(169);
        filme2.setInlcuidoNoPlano(true);
        filme2.recebeAvaliacao(9.9);
        filme2.recebeAvaliacao(7.5);
        filme2.recebeAvaliacao(8);
        filme2.recebeAvaliacao(6);

        Filme filme3 = new Filme("matrix", 2020);
        filme3.setDuracaoEmMinutos(150);
        filme3.recebeAvaliacao(9);
        filme3.recebeAvaliacao(8.6);
        filme3.recebeAvaliacao(8.7);

        //System.out.println("Media das avaliacoes: "+ filme1.calculaMedia());

        //SERIE

        Serie you = new Serie("YOU", 2018);
        you.setTemporadas(4);
        you.setEpsPorTemporada(10);
        you.setMinutosEp(50);
        //System.out.println("Duracao total da serie: " + you.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(filme3);
        calculadora.inclui(you);

        //System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        //filtro.filtra(filme2);

        //EPISODIO

        Episodio episodio1 = new Episodio();
        episodio1.setNumero(1);
        episodio1.setSerie(you);
        episodio1.setTotalVisualizacoes(1236);
        //filtro.filtra(episodio1);

        //ARRAYLIST

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Nome do primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);



    }

}
