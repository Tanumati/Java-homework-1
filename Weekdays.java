import java.util.Scanner;

public class Weekdays {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1 to 7");
        int i = scanner.nextInt();
        if(i==1) {System.out.println("Monday");}
        else if(i==2) {System.out.println("Tuesday");}
        else if (i==3){System.out.println("Wedsneday");}
        else if(i==4){System.out.println("Thursday");}
        else if(i==5){System.out.println("Friday");}
        else if (i==6){System.out.println("Saturday");}
        else if (i==7) {System.out.println("Sunday");}
        else {System.out.println("Nothing");}
    }
}






