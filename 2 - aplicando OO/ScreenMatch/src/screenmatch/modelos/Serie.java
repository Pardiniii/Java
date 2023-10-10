package screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int epsPorTemporada;
    private int minutosEp;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsPorTemporada() {
        return epsPorTemporada;
    }

    public void setEpsPorTemporada(int epsPorTemporada) {
        this.epsPorTemporada = epsPorTemporada;
    }

    public int getMinutosEp() {
        return minutosEp;
    }

    public void setMinutosEp(int minutosEp) {
        this.minutosEp = minutosEp;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsPorTemporada * minutosEp;
    }
}
