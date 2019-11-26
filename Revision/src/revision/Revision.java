
package revision;
import java.util.Scanner;

public class Revision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        
        char choice;
        int weight;
        System.out.println("Please choose your class:");
        System.out.println("F- First Class");
        System.out.println("B- Business Class");
        System.out.println("E- Economic Class");
        choice = reader.next().charAt(0);
        System.out.println("Please enter your baggage weight");
        weight = reader.nextInt();
        
        switch (choice)
        {
            case 'F':
            
                if (weight > 30)
                    System.out.println("The cost of extra weight is "+((weight - 30)*10));
                else
                    System.out.println("The is no extra fees, Safe Flight");
            break;
            
            case 'B':
                
                if (weight > 25)
                    System.out.println("The cost of extra weight is "+((weight - 25)*10));
                else
                    System.out.println("The is no extra fees, Safe Flight");
            break;
            
            case 'E':
            
                if (weight > 20)
                    System.out.println("The cost of extra weight is "+((weight - 20)*10));
                else
                    System.out.println("The is no extra fees, Safe Flight");
            break;
            
            default:
                System.out.println("Please enter a valid choice");
        }
    }
    
}
