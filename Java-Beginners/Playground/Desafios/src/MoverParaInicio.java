import java.util.*;
import java.util.Scanner;
import static java.lang.System.*;

public class MoverParaInicio {

    public static void main(String args[]) {

        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares

        // Criando o objeto scanner:
        Scanner scanner = new Scanner(System.in);
        int tam = scanner.nextInt(); // quantidade de números a receber

        int [] nums = new int[tam];
        int primeiroNumero = 0;

        for (int i = 0; i < tam; i++) nums[i] = scanner.nextInt(); // recebendo numeros

        for(int i = 0; i < tam; i++) {
            if(nums[i] % 2 == 0) { // se o atual for par
                int auxiliar = nums[primeiroNumero]; // armazena primeiro
                nums[primeiroNumero] = nums[i]; // atribui o numero par a primeira posição
                nums[i] = auxiliar; // devolve o número armazenado para a posição corrente
                primeiroNumero++;
            }
        }

        for(int numero : nums) out.println(numero);
    }
}

