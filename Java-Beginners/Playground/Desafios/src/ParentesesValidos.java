import java.util.Scanner;

public class ParentesesValidos {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        char f = s.charAt(0);
        char d = s.charAt(1);
        switch(d){
        case ')':
                if(f == '(')
                    return true; 
            case ']':
                if(f == '[')
                    return true; // bem formada
            case '}':
                if(f == '{')
                    return true; // bem formada
            default:
                return false;
            }
    }
}
