package screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean inlcuidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


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
}
