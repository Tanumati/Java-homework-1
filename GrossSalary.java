import java.util.Scanner;

public class GrossSalary {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Id ");
        int id = scanner.nextInt();
        System.out.println("Enter the Name");
        String name = scanner.next();
        System.out.println("Enter the Basic salary");
        double salary = scanner.nextDouble();
        double hra = salary*(0.10); System.out.println("Enter the HRA"+"="+hra);
        double da = salary*(0.08); System.out.println("Enter the Da"+"="+da);
        double ta = salary*(0.09); System.out.println("Enter the TA"+"="+ta);
        double pf = salary*(0.20);System.out.println("Enter the PF"+"="+pf);
        double gross = (salary+hra+da+ta-pf);System.out.println("Enter the Gross salary"+"="+ gross);
    }
}
