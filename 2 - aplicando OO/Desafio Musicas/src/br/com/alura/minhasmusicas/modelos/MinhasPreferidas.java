package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " Eh preferido por todos");
        }else {
            System.out.println(audio.getTitulo() + " eh bom mas tem melhores :(");
        }

    }
}
