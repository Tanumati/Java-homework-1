import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter any alphabet ");
        char c = scanner.next().charAt(0);
        int i;
        i =(int)c;
         if (i==65||i==69||i==73||i==79 || i==85|| i==97 || i==101 || i==105 || i==111 || i==117)
             {System.out.println("Vowel");}
         else
             {System.out.println("Consonant");}
    }
}
