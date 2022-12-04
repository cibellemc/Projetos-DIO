import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuadradosPerfeitos {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Lista que irá armazenar os quadrados perfeitos encontrados:
        List<Integer> quadradosPerfeitos = new ArrayList<>();

        int numero = scanner.nextInt();

        for (int i = 1; i < numero; i++) {
            if (ehQuadradoPerfeito(i)) quadradosPerfeitos.add(0, i);
        }

        int tamanhoLista = quadradosPerfeitos.size();
        int resultado = numero;

        for (int i = 0; i < tamanhoLista; i++) {

            int copiaNumero = numero;
            int contador = 0;

            for (int x = i; x < tamanhoLista; x++) {
                int atual = quadradosPerfeitos.get(x);

                while((copiaNumero - atual) >= 0){ // emquanto não zera, continua decrementando
                    copiaNumero -= atual; 
                    contador ++; // armazena número de decrementos
                }
            }

            if (contador < resultado) resultado = contador;
        }

        System.out.println(resultado);

    }

    static boolean ehQuadradoPerfeito(int numero){
        Double raiz = Math.sqrt(numero);
        return(raiz - raiz.intValue() == 0);
    }
}