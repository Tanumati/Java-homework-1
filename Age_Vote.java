import java.util.Scanner;

public class Age_Vote {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter her/his age");
        int age = scanner.nextInt();
        //if(age>=18){System.out.println("person is eligible for vote");}
        //else{System.out.println("person is not eligible for vote");}
        System.out.println((age>=18?"person is eligible":"person is not eligible"));
    }
}
