import java.util.Scanner;

public class CityName {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char a= scanner.next().charAt(0);

        if(a=='a'||a=='A'){System.out.println("Ahmedabad");}
        else if (a=='b'||a=='B'){System.out.println("Bombay");}
        else if(a=='c'||a=='C'){System.out.println("Chennai");}
        else if(a=='d'||a=='D'){System.out.println("Delhi");}
        else if(a=='e'||a=='E'){System.out.println("East ham");}
        else if(a=='f'||a=='F'){System.out.println("Florida");}
        else{System.out.println("Invalid entry");}

    }
}
