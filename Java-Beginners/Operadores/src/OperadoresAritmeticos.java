public class OperadoresAritmeticos {
    public static void main(String[] args) throws Exception {
        double soma = 10.5 + 15.7; 
        String nomeCompleto =  "Cibelle" + "Maciel"; // + tambem serve pra concatenação

        int subtração = 113 - 25;

        int multiplicacao = 20 * 7;

        int divisao = 15 / 3;

        int modulo = 18 % 3; // verificar se havera resto da divisao
        System.out.println(modulo);

        double resultado = (10 * 7) + (20/4);

        
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1; // quando encontra string, realiza concatenação
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); // nesse caso, fez a evidência e depois concatenou
        System.out.println(concatenacao);

    }
}
