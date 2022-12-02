import java.util.Scanner;

public class QuadradoPerfeito {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println(quantosQuadradosPerfeitos(n));
    }
        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.

    static int quantosQuadradosPerfeitos(int numero){
        int quadrados = 0;
        for(int i = 1; i < numero; i++){
            if(ehQuadradoPerfeito(i)){
                quadrados++;
            } 
        }
        return quadrados;
    }

    static boolean ehQuadradoPerfeito(int numero){
        Double raiz = Math.sqrt(numero);
        return(raiz - raiz.intValue() == 0);
    }
}
