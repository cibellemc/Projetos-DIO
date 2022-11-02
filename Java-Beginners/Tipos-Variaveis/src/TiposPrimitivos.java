public class TiposPrimitivos {
    public static void main(String[] args) {
        String meuNome = "Cibelle Maciel";

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // "forçando conversão"
        // desse modo haveria erro, pois um short pode não ter capacidade para armazenar int:
        // short numeroCurto2 = numeroNormal;
        
        int numero = 5;
        numero = 10; // quando nao se é const, podem haver novas atribuições, desde que de mesmo tipo
    }
}
