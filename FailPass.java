import java.util.Scanner;

public class FailPass {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = scanner.nextLine();
        System.out.println("Enter the roll number");
        int roll = scanner.nextInt();
        System.out.println("Enter the Maths mark");
        int Mm = scanner.nextInt();
        System.out.println("Enter the English mark");
        int Em = scanner.nextInt();
        System.out.println("Enter the Science mark");
        int Sm = scanner.nextInt();
        System.out.println(Mm>=35|| Em>=35|| Sm>=35?"pass":"fail");
    }
}
