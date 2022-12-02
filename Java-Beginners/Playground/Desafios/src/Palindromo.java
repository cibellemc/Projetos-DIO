import java.util.Scanner;

public class Palindromo {

    //Neste desafio você deverá construir uma função que recebe uma String e 
    //identifique se a mesma é um palíndromo, ou seja, se a String é igual a ela mesma invertida. 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        // tive que fazer um if aqui fora, pois o teste queria "TRUE" e "FALSE"
        System.out.println(ehPalindromo(palavra));
        /*String palavra1 = sc.nextLine();
        System.out.println(ehPalindromo(palavra1));
        String palavra2 = sc.nextLine();
        System.out.println(ehPalindromo(palavra2));*/

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
    }

    static boolean ehPalindromo(String palavra){
        String saida = "";
        for(int i = palavra.length() - 1; i >= 0; i--){
            saida = saida + palavra.charAt(i);
        }
        //System.out.println(saida);
        return palavra.equalsIgnoreCase(saida);
    }
}
