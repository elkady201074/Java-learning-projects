/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package another.pkgwhile.loop;
import java.util.Scanner;
/**
 *
 * @author DatumCo
 */
public class AnotherWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);   
    int Grade, Counter, sum; float average;
    Grade = 0; sum = 0; Counter = 1; average = 0;
    while (Counter <= 6)
    {
        System.out.print("Please enter your Grade: ");
        Grade = input.nextInt();
        sum += Grade;
        Counter++;

        average = sum/Counter;
        
    }
    System.out.printf("Average Grade is %f", average);

// TODO code application logic here
    }
    
}
