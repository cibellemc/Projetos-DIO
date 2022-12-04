// Mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares 

import java.util.Scanner;

public class ExcluiParSeguidoImpar {
    public static void main(String args[]) {
          
        try (Scanner input = new Scanner(System.in)) {
            int N = input.nextInt(); // informa a quantidade de números a receber

            int [] nums = new int[N];

            for (int i = 0; i < N; i++){ // recebe os números
                nums[i] = input.nextInt();
            }
            
            if (N == 1) System.out.println(nums[0]); // se só receber um número, printa ele
            
            int j = 1;
            
            for (int i = 0; i < nums.length; i++) {
                if (i == N -1) {
                    /* se chegar ao final do array, printa sem comparar, pois 
                    não tera a próxima posição e dispara erro*/ 
                    System.out.println(nums[i]); 
                    break;
                }

                if (!ehPar(nums[i]) || // se o atual for ímpar
                    ehPar(nums[j])) // se o prox for par
                { 
                    System.out.println(nums[i]);
                }
                j++; // incrementar pra ir pro prox número da lista
            }
        }
    }

    static boolean ehPar(int num){
        return num % 2 == 0;
    }
}