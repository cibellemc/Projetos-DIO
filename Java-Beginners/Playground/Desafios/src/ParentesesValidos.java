import java.util.Scanner;

public class ParentesesValidos {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        String saida = "";
        char first = s.charAt(0);
        String second = s.charAt(1);
        if (first == "(" && second == ")" ||
            first == "[" && second == "]"||
            first == "{" && second == "}") {
            return true;
        }
    }
}
