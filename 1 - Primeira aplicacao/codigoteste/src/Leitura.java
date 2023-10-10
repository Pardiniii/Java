import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println("Agora sua serie favorita:");
        String serie = leitura.nextLine();

        System.out.println("Informe sua idade:");
        int idade = leitura.nextInt();

        System.out.println("Qual sua nota de 0 a 10 para o filme TopGun?");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(serie);
        System.out.println(idade);
        System.out.println(avaliacao);
    }
}
