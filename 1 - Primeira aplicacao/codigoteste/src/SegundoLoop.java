import java.util.Scanner;

public class SegundoLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Diga sua avaliacao para o filme ou -1 para sair.");
            nota = scanner.nextDouble();
            if ( nota != -1) {
                soma += nota;
                totalDeNotas++;
            }
        }
        if (totalDeNotas == 0){
            System.out.println("voce nao deu nota");
        }else {
            System.out.println("A media de avaliacoes foi de:" + soma/totalDeNotas);
        }
    }
}
