import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double saldo = 300;
        String nome = "Gustavo Pardini";
        String tipoConta = "Conta corrente";

        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta:" + tipoConta);
        System.out.println("Seu saldo:" + saldo);

        int opcao = 0;
        while (opcao != 4){
            System.out.println("""
                    OPCOES:
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- sair
                    """);
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Seu saldo é de: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite quanto voce quer receber:");
                    double receber = leitura.nextDouble();
                    saldo += receber;
                    System.out.println("Seu novo saldo é: " + saldo);
                    break;
                case 3:
                    System.out.println("Digite qual valor voce deseja transferir: ");
                    double transferir = leitura.nextDouble();
                    if (transferir > saldo){
                        System.out.println("Saldo insuficiente para a transferencia!");
                    }else {
                        saldo -= transferir;
                        System.out.println("Seu novo saldo é: " + saldo);
                    }
                    break;
                case 4:
                    opcao = 4;
                    System.out.println("Fechando sistema....");
                    break;
            }
        }

    }
}