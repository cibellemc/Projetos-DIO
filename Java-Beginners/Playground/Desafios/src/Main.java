import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int N = numero.nextInt();
        
        System.out.println(somatorio(N));
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}