/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatements;
import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int X;
       System.out.println("Please enter your number!");
       X = input.nextInt();
       if (X %2 == 0)
         System.out.printf("This number \"%d\" is even", X);
       else 
         System.out.printf("This number \"%d\" is odd", X);
       }
       
       
    }
    

