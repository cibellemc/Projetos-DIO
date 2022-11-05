public class Quadrilatero {
    public static void area(double lado){
        System.out.println("Área do quadrado: " + lado*lado); 
    }

    public static void area(double ladoMenor, double ladoMaior){
        System.out.println("Área do retângulo: " + ladoMaior*ladoMenor); 
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio: " + (baseMaior+baseMenor)*altura / 2); 
    }

    public static void area(float diagonalMaior, float diagonalMenor, float altura){
        System.out.println("Área do trapézio: " + (diagonalMaior+diagonalMenor)*altura / 2); 
    }
}