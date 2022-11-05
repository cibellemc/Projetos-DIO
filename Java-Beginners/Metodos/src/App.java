public class App {
    public static void main(String[] args) {
        // Calculadora 
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(1,2));
        System.out.println(calculadora.dividir(1,2));

        // quando são static,podemos chamar diretamente a Classe
        Calculadora.soma(1,2);
        Calculadora.divisao(1,2);
        

        // Emprestimo
        
    }
}
