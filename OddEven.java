import java.util.Scanner;
// ternary operator
public class OddEven {
    public static void main (String[]args){
        Scanner tanu = new Scanner(System.in);
        System.out.println("Enter the first number");
         int a = tanu.nextInt();
         System.out.println("Enter the second number");
         int b = tanu.nextInt();
         System.out.println((a%2==0?"even number":"odd number"));
         System.out.println((b%2==0?"even number":"odd number"));



    }
}
