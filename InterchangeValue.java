import java.util.Scanner;

public class InterchangeValue {
    public static void main (String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the First value");
        int a = scanner.nextInt();
        System.out.println("Enter the second value");
        int b = scanner.nextInt();

        if(a==a){System.out.println("interchange Value"+(b));}
        else{System.out.println("not change");}
        if (b==b){System.out.println("interchange change"+(a));}
        else{System.out.println("not change");}
    }
}
