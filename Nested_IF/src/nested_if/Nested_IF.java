/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested_if;
import java.util.Scanner;

public class Nested_IF {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        /* int Number;
        System.out.println("Please enter your Number");
        Number = input.nextInt();
        if (Number >= 0)
        {  if (Number %2 == 0)
                System.out.printf("This Number \"%d\" is even", Number);
            else 
                System.out.printf("This Number \"%d\" is Odd", Number);
        }
        else 
            System.out.println("Please Enter Positive Number");
            */
      /* int Grade;
       System.out.println("Please enter your Grade");
       Grade = input.nextInt();
       if (Grade >= 90)
           System.out.print("Your Score is A");
       else if (Grade >= 80)
           System.out.println("Your Score is B");
       else if (Grade >= 70)
           System.out.println("Your Score is C");
       else 
           System.out.println("Your Score is f");
*/
    for (int i=0 ; i < 10 ; ++i){
                int Grade;
      System.out.println("Please enter your Grade");
      Grade = input.nextInt();
      if (Grade >= 90 && Grade <= 100)
          System.out.println("A");
      else if (Grade >= 80 && Grade < 90)
          System.out.println("B");
      else if (Grade >= 70 && Grade < 80) 
          System.out.println("C");
      else if (Grade >= 60 && Grade < 70)
          System.out.println("D");
      else 
          System.out.println("F");
          
           }
    }
    
}
