public class OperadoresUnarios {
    // incrementar, decrementar, inverter valores numericos
    public static void main(String[] args) {
        int numero = 5;
		
        //imprimindo o numero negativo: nao afeta variavel principal, seria necessaria nova atribuição
        System.out.println(- numero); 

        // para tornar valor positivo seria necessário multiplicar po -1

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// imprime numero e depois incrementa
        System.out.println(numero);// agora sim, mostra numero

        //ordem de precedencia conta aqui
        System.out.println(++ numero); // incrementa e imprime
        
        System.out.println(numero --);
        System.out.println(numero);

        boolean verdadeiro = true;
        // negação
        System.out.println("Inverteu " + !verdadeiro);
    }
}
