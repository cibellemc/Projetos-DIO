public class OperadoresTernarios {
    public static void main(String[] args) {
        // if em uma linha
        // condição? verdade impressa : falsa impressa
        int a = 5;
        int b = 6;
        String resultado = "";

        if(a==b)
           resultado = "verdadeiro";
        else
           resultado = "falso";
        
        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado1 = (a==b) ? "verdadeiro" : "false";
        
        // como a variavel é string, se espera um "retorno string"
        int resultado2 = (a==b) ? 0 : 1;

        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(resultado2);

    }
}
