
import java.util.Scanner;

public class FatorialDesajeitada {
    public static void main(String args[]) {
        int numero = new Scanner(System.in).nextInt();
        int resultado = 0;
        int j = 0;
        int [] v = new int [numero];
        
        // preenchendo array com os números da fatorial
        for (int i = numero; i > 0; i--) {
            v[j] = i; // fica em ordem decrescente
            j++;
        }

        for (int k = 0; k < v.length; k = k-3) {
            if (numero >=3) resultado += numero * (numero - 1) / (numero - 2);
            numero--;
        }
        
        if (numero == 2) resultado -= (numero - 3);
        // Somando todos os números dentro da lista:
        System.out.println(resultado);
    }
}

