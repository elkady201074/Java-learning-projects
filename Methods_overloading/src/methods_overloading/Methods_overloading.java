package methods_overloading;
import java.util.Scanner;

public class Methods_overloading {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    int choice;
    do{
        System.out.println("Please choose one option:");
        System.out.println("1- Comapare two numbers");
        System.out.println("2- Compare two characters");
        System.out.println("3- Compare three numbers");
        choice = input.nextInt();
        switch (choice){
            case 1: 
              { System.out.println("Please enter the First number:");
                int n1 = input.nextInt();
                System.out.println("Please enter the Second number:");
                int n2 = input.nextInt();
                System.out.println(larger(n1, n2));
                break;}
            case 2:
              { System.out.println("Please enter the First Character");
                char n1 = input.next().charAt(0);
                System.out.println("Please enter the Second Character");
                char n2 = input.next().charAt(0);
                System.out.println(larger(n1, n2));
                break;}
            case 3:
               {
               System.out.println("Please enter the First number:");
               int n1 = input.nextInt();
               System.out.println("Please enter the Second number:");
               int n2 = input.nextInt(); 
               System.out.println("Please enter the third number:");
               int n3 = input.nextInt();
               System.out.println(larger(n1, n2, n3));
               break;
               }
            default:
                System.out.println("Please Enter a valid option");

        }
        
    } while (choice != 1 && choice != 2 && choice != 3);
    }
    // Func to return larger number
    public static int larger (int n1, int n2)
    {
    if (n1 > n2)
        return n1;
    else 
        return n2;
    }
    
    // Func to return larger char
    public static char larger (char n1, char n2)
    {
    if (n1 > n2)
        return n1;
    else
        return n2;
    }
    
    //Func to return larger number from 3 integers
    public static int larger (int n1, int n2, int n3)
    {
        if (n1 > n2 && n1 > n3)
            return n1;
        else if (n2 > n1 && n2 > n3)
            return n2;
        else 
            return n3;
    }
    
}
