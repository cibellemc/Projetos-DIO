import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        FizzBuz(num);

    }
    
    public static void FizzBuz(int num){
      
      if (num % 3 == 0 && num % 5 == 0){
        System.out.println("FizzBuzz");
      } else if (num % 3 == 0){
        System.out.println("Fizz");
      } else if (num % 5 == 0){
        System.out.println("Buzz");
      } else {
        System.out.println(num);
      }
    }
}