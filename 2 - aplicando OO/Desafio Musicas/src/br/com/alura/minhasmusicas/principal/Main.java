package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Circles");
        musica1.setCantor("Post Malone");

        for (int i = 0; i < 500; i++) {
            musica1.reproduz();
        }
        for (int i = 0; i < 300; i++) {
            musica1.curtir();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Sinapse");
        podcast1.setHost("Pedro e Greg");

        for (int i = 0; i < 200; i++) {
            podcast1.reproduz();
        }
        for (int i = 0; i < 80; i++) {
            podcast1.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast1);
        preferidas.inclui(musica1);
    }
}
