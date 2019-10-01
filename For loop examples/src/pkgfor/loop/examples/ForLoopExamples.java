/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor.loop.examples;
import java.util.Scanner;
/**
 *
 * @author DatumCo
 */
public class ForLoopExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int value,sum1=0,sum2=0;
    for (int counter=1; counter<=10; counter++) 
    {
    System.out.println("Please Enter Number " + counter);
    value = input.nextInt();        
        if (value%2==0)
            sum1 +=value;
        else 
            sum2 +=value;
    }
   System.out.println("The sum of Even values is "+ sum1);
    System.out.println("The sum of Odd Number is "+ sum2);
    
    
    









        // TODO code application logic here
    }
    
}
