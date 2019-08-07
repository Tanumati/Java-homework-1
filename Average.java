import java.util.Scanner;

public class Average {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter the third number");
        int c = scanner.nextInt();
        System.out.println("Enter the fourth number");
        int d = scanner.nextInt();
        System.out.println("Enter the fifth number");
        int e= scanner.nextInt();
        System.out.println("Total number "+ (a+b+c+d+e));
        int toatl= (a+b+c+c+d);
        int ave =(a+b+c+d+e)/5;
        System.out.println("Average"+ave);
    }
}
