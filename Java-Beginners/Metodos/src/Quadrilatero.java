public class Quadrilatero {
    public static double area(double lado){
        return  lado*lado; 
    }

    public static double area(double ladoMenor, double ladoMaior){
        return ladoMaior*ladoMenor; 
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return (baseMaior+baseMenor)*altura / 2; 
    }

    public static double area(float diagonalMaior, float diagonalMenor, float altura){
        return (diagonalMaior+diagonalMenor)*altura / 2; 
    }
}