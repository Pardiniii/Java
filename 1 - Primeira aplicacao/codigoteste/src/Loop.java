import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somanotas = 0;
        double nota = 0;


        for (int i = 0; i < 3; i++){
            System.out.println("digite a sua nota para o filme:");
            nota = scanner.nextDouble();
            somanotas += nota;

        }
        double media = somanotas/3;
        System.out.println("a media das notas foi:" + media);
    }
}
