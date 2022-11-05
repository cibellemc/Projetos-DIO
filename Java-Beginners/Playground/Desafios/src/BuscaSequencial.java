import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int elemento = leitor.nextInt();
        
        System.out.println(buscarElemento(elemento));
    }
    
    public static String buscarElemento(int numeroProcurado){
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        for (int i = 0; i < elementos.length; i++){ // i até a posição 9 
            
            if (elementos[i] == numeroProcurado){ // se o elemento do array na posição corrente for igual ao procurado
            return ("Achei " + elementos[i] + " na posição " + i); // se isso acontecer, a função acaba aqui
            }
        } return ("Numero " + numeroProcurado + " nao encontrado!" ); // se passar, significa que nao encontrou e encerra aqui
        
    }
}