package screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean inlcuidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length() > 4){
            throw new ConversaoDeAnoException("Nao foi possivel converter o ano" +
                    "pois tem mais de 4 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 3));
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public void setTotalDeAvaliacoes(){
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento(){
        return this.anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano(){
        return this.inlcuidoNoPlano;
    }
    public void setInlcuidoNoPlano(boolean inlcuidoNoPlano) {
        this.inlcuidoNoPlano = inlcuidoNoPlano;
    }

    public int getDuracaoEmMinutos(){
        return this.duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFicha(){
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lancamento: "+ anoDeLancamento);
        System.out.println("Duração em Minutos:" + duracaoEmMinutos);
        System.out.println("Incluido no plano: " + inlcuidoNoPlano);
    }

    public void recebeAvaliacao(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double calculaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", anoDeLancamento = " + anoDeLancamento +
                ", duracao em minutos: " + duracaoEmMinutos;
    }
}
