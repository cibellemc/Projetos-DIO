public class OperadoresRelacionais {
    // operando da esquerda é maior, menor, igual, diferente
    public static void main(String[] args) {
        String nomeUm = "GLEYSON";
        String nomeDois = "GLEISON";
        System.out.println(nomeUm == nomeDois);

        // para comparar objetos usa equals
        String nomeTres = "GLEYSON";
        String nomeQuatro = new String("GLEYSON");
        System.out.println(nomeTres.equals(nomeQuatro));

        int numero1 = 1;
        int numero2 = 2;

        // poderia ser atribuido a variavel
        boolean simNao = numero1 == numero2;
        System.out.println(simNao);

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2\n");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2\n");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2\n");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2\n");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2\n");
    }
}
