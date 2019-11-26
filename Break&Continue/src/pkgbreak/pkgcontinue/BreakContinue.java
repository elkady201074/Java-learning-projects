/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbreak.pkgcontinue;
import java.util.Scanner;

public class BreakContinue { 

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int num, sum= 0;   
    for (int i=1;i<=5;i++)
    {
    System.out.println("Please enter a positive 5 numbers to sum" +i);
    num = input.nextInt();
        if (num>0)
        {
        sum += num;
        }
        else 
        {
        System.out.println("Negative numbers are not allowed");
        break;
        }
    
    }  
    System.out.println("The sum is equal to "+ sum);
    }
    
}
