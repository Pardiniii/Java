
public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int lancamento = 2022;
        System.out.println("O ano de lancamento de top gan maverick foi "+ lancamento);
        boolean incluidoNoPlano =  false;
        double nota1 = 8.34;
        double nota2 = 9.78;
        double nota3 = 6.04;
        double media = (nota1 + nota2 + nota3)/3;
        System.out.println("A nota de topgun é: "+media);
        String sinopse;
        //colocar o texto entre tres aspas duplas permite com que voce edite a formatacao dele
        sinopse = """
                Filme de ação blablabla
                testando a formatacao diferenciada
                assim.""";
        //System.out.println(sinopse);

        int classificacao;
        classificacao = (int) media /2;
        System.out.println(classificacao);

        String nomeCorreto = "Gustavo";
        String senhaCorreta = "1234";

        String nome = "Gustavo";
        String senha = "1234";

        if (nome.equals(nomeCorreto) && senha.equals(senhaCorreta)){
            System.out.println("Acesso permitido");
        }else {
            System.out.println("Acesso negado");
        }

        int idade = 18;
        double  dinheiro = 127.1294576;

        System.out.println(String.format("Meu nome é %s, tenho %d anos e hoje comprei um carro de %.2f reais", nome, idade, dinheiro));


        int a = 10;
        int b = 5;
        int c = b;

        boolean igual = (b == c);
        boolean diferente = (b != a);
        boolean maior = (a > c);

        if (c == b){
            System.out.println("igual");
        }else {
            System.out.println("diferente");
        }

        int num = 10;
        int result = num++;
        System.out.println(num);
        System.out.println(result);

        //CONVERSOR DE CELCIUS PARA FAHRENHEIT

        double temperaturaC = 26;
        double temperaturaF;
        temperaturaF = (temperaturaC * 1.8) + 32;
        System.out.println(temperaturaF);
        double temperaturaFInteira = (int) temperaturaF;
        System.out.println(temperaturaFInteira);


    }
}