import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.setNome("Homem aranha");
        filme1.setAnoDeLancamento(2023);
        filme1.setInlcuidoNoPlano(true);
        filme1.setDuracaoEmMinutos(120);

        filme1.exibeFicha();
        filme1.recebeAvaliacao(8.9);
        filme1.recebeAvaliacao(9.5);
        filme1.recebeAvaliacao(10);

        //System.out.println("Media das avaliacoes: "+ filme1.calculaMedia());

        Serie you = new Serie();
        you.setNome("YOU");
        you.setAnoDeLancamento(2018);
        you.setTemporadas(4);
        you.setEpsPorTemporada(10);
        you.setMinutosEp(50);
        System.out.println("Duracao total da serie: " + you.getDuracaoEmMinutos());

        Filme filme2 = new Filme();
        filme2.setNome("Interstellar");
        filme2.setDuracaoEmMinutos(169);
        filme2.setInlcuidoNoPlano(true);
        filme2.setAnoDeLancamento(2014);
        filme2.recebeAvaliacao(9.9);
        filme2.recebeAvaliacao(7.5);
        filme2.recebeAvaliacao(8);
        filme2.recebeAvaliacao(6);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(you);

        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme2);

        Episodio episodio1 = new Episodio();
        episodio1.setNumero(1);
        episodio1.setSerie(you);
        episodio1.setTotalVisualizacoes(1236);
        filtro.filtra(episodio1);
    }

}
