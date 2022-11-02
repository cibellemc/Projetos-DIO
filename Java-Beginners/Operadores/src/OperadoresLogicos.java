public class OperadoresLogicos {
    public static void main(String[] args) {
    // tabela verdade
    boolean condicao1=true;

    boolean condicao2=true;

    // se 1 e 2 forem verdadeiras
    if(condicao1 && (7 > 10)) // nao ira ser executado codigo
        System.out.print("Os dois valores são verdadeiros\n");;

    //Se condicao1 OU condicao2 for verdadeira
    if(condicao1 || condicao2)
        System.out.print("Pelo menos uma das condições é verdadeira.");
    
}
}
