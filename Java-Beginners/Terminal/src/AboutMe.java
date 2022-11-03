public class AboutMe {
    public static void main(String[] args) { 
        /* pode receber parâmetros externos
        * array de argumentos começam com indice 0

        Abordagem de passar todos os argumentos em ordem, numa linha:
        * java AboutMe Cibelle Maciel 18 1.52 - no terminal
        * Run > Add Configuration > "args": ["GLEYSON", "SAMPAIO", "28", "1.58"] -  na IDE
        */ 

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
