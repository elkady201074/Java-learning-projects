/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor.loop;
import java.util.Scanner;
/**
 *
 * @author DatumCo
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int Grade, sum=0;
    for (int counter=1 ; counter <= 6; counter++) 
    {
    System.out.println("Please enter the Grade of Student Number" + counter);
    Grade = input.nextInt();
    sum +=Grade;
    
    }
    System.out.println("The average of Grades = " + (sum/6));
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
