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


        // Quadrilatero
        double quadrado = Quadrilatero.area(7);
        double retangulo = Quadrilatero.area(7.4, 14);
        double losango = Quadrilatero.area(7f, 5f, 2f);
        double trapezio = Quadrilatero.area(7d, 5d, 2d);

        System.out.println("Área do quadrado: " + quadrado);
        System.out.println("Área do retângulo: " + retangulo);
        System.out.println("Área do losango: " + losango);
        System.out.println("Área do trapézio: " + trapezio);
    }
}
