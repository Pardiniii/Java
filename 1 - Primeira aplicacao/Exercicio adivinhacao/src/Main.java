import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá! Bem vindo ao jogo de adivinhação, acerte o numero aleatorio (entre 1 e 100) em ate 5 tentativas.");

        int numero = gerador.nextInt(100) + 1;
        int chute;

        for (int i = 0; i < 5; i++){
            System.out.println("Chute um numero:");
            chute = leitor.nextInt();
            if (chute == numero){
                System.out.println("Voce acertou!");
                break;
            } else if (chute > numero) {
                System.out.println("O seu chute foi maior que o numero sorteado, tente novamente.");
            }else {
                System.out.println("O seu chute foi menor que o numero sorteado, tente novamente.");
            }

            }
        }
    }
