import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class UpperLower {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the any alphabet Uppercae");
        System.out.println("Enter the any alphabet Lowercase");

        char a = scanner.next().charAt(0);
        int i;
        i= (int)a;
       // i= i+32;
        i= i-32;
        a= (char)i;
        System.out.println(a);
    }
}
