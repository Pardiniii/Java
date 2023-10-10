public class Condicional {
    public static void main(String[] args) {
        int lancamento = 2022;
        boolean incluidoNoPlano =  false;
        double notaDoFilme = 8.45;
        String tipoPlano = "normal";

        if (lancamento >= 2022){
            System.out.println("Lancamento que os clientes estao curtindo!");
        }else {
            System.out.println("Filme velho.");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado!");
        }else {
            System.out.println("Nao tem amigao, paga ai");
        }






    }
}
