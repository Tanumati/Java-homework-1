import java.util.Scanner;

public class NagativePositive {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = scanner.nextInt();
        if(a>=1)
        {System.out.println("positive");}
        else if(a<=-1)
        {System.out.println("negative");}
        else
            {System.out.println("zero");}
    }
}
