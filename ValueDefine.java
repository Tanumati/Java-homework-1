import java.util.Scanner;

public class ValueDefine {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value");
        //double a = scanner.nextDouble();
       char d = scanner.next().charAt(0);
        //String b = scanner.next();
        int i;
        i =(int)d;
         if (i>=48&&d<=57)
         {System.out.println("numeric");}
         else if((i>=65&&d<=90)||(i>=97&&d<=122))
         {System.out.println("Alphabet");}
         else
             {System.out.println("symbol");}

    }
}
