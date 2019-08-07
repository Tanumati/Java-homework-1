import java.util.Scanner;

public class StudentResult {
    public static void main(String[]args){

        System.out.println("Enter student name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter the roll number");
        int roll = scanner.nextInt();
        System.out.println("Enter the Maths mark");
        int Mm = scanner.nextInt();
        System.out.println("Enter the English mark");
        int Em = scanner.nextInt();
        System.out.println("Enter the Science mark");
        int Sm = scanner.nextInt();
        System.out.println("Enter the total mark of three subjects " +"="+(Mm+Sm+Em));
        System.out.println("Total percentage"+(Mm+Sm+Em)/(3)+" %");
        if((Mm+Sm+Em)/(3)>=35){System.out.println("The result is pass");}
        else { System.out.println("THE result is fail");}
        if((Mm+Sm+Em)%3>=35)
        System.out.println("The grade is ");
        else if(((Mm+Sm+Em)/(3)>=80)){System.out.println("A+");}
        else if(((Mm+Sm+Em)/(3)>=60)){System.out.println("A");}
        else if (((Mm+Sm+Em)/(3)>=50)){System.out.println("B");}
        else if (((Mm+Sm+Em)/(3)>=35)){System.out.println("c");}
        }
    }

