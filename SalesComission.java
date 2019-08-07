import java.util.Scanner;

public class SalesComission {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales Id");
        int id = scanner.nextInt();
        System.out.println("Enter the Seller's name ");
        String name  = scanner.next();
        System.out.println("Enter the Sales amount");
        double amount= scanner.nextDouble();
        System.out.println("Enter the Salary basic");
        double basic= scanner.nextDouble();

        if(amount>=50000){System.out.println("Commission"+ amount*(0.35));}
        else if ( amount>=30000){System.out.println("Commission"+amount*(0.20));}
        else if (amount>=20000){System.out.println("Commission"+amount*(0.10));}
        else if(amount>=10000){System.out.println("Commission"+amount*(0.05));}
        else {System.out.println("Commission "+amount*(0.02));}
    }
    }

