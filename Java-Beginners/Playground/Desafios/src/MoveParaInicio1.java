// Mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares 

import java.util.Scanner;

public class MoveParaInicio1 {
    public static void main(String args[]) {
          
        Scanner input = new Scanner(System.in);
            int N = input.nextInt(); // informa a quantidade de números a receber

            int [] nums = new int[N];

            for (int i = 0; i < N; i++){ // recebe os números
                nums[i] = input.nextInt();
            }
            
            // variáveis de controle
            int j = 0;
            int k = 0;
            
            int qtdPares = contarPares(nums);
            
            int [] pares = new int[qtdPares];
            int [] impares = new int[N - qtdPares];
            int [] novoNums = new int[N];

            // primeiro separo pares e ímpares 
            for (int i = 0; i < nums.length; i++) {
                if (ehPar(nums[i])) { 
                    pares[j] = nums[i];
                    j++;
                } else {
                    impares[k] = nums[i];
                    k++;
                }
            }

            // ponho no novo array
            for (int i = 0; i < qtdPares; i++) {
                novoNums[i] = pares[i];
            }

            int l = 0;
            for (int i = qtdPares; i < novoNums.length ; i++) {
                novoNums[i] = impares[l]; // estava botando j, mas como tem escopo global, deu erro
                l++;
            }

            mostrarNovoArray(novoNums);
        }
    
    static void mostrarNovoArray(int novoNums[]){
        for (int num : novoNums) System.out.println(num); // estava printando errado
    }

    static int contarPares(int nums[]){
        int qtdPares = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ehPar(nums[i])) qtdPares++;
        }

        return qtdPares;
    }

    static boolean ehPar(int num){
        return num % 2 == 0;
    }


}