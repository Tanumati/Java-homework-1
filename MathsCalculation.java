import java.util.Scanner;

public class MathsCalculation {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numbers");
        int a = scanner.nextInt();
        System.out.println("Enter  Second number");
        int b = scanner.nextInt();
        System.out.println("Enter the calc Symbol,+,/,*,- " );
        String symbol= scanner.next();
        if(symbol.equals("+"))
        {System.out.println(a+b);}
        else if (symbol.equals("*"))
        {System.out.println(a*b);}
        else if (symbol.equals("/"))
        {System.out.println(a/b);}
        else if(symbol.equals("-"))
        {System.out.println(a-b);}
        else{
    }
}
}
