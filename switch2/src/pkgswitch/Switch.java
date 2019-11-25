/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;
import java.util.Scanner;
/**
 *
 * @author DatumCo
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
   /* Scanner input = new Scanner(System.in);
    int num1, num2, imput ;
    System.out.println("Please choose one option to continue: ");
    System.out.println("1- Add two numbers");
    System.out.println("2- Get subtract two Numbers");
    System.out.println("3- Get square of a Number");
    imput = input.nextInt();
   
    switch (imput)
    {
        case 1 :  
            System.out.println("Please enter First Number:");
            num1 = input.nextInt();
            System.out.println("Please enter Second Number: ");
            num2 = input.nextInt();
            System.out.println("The adding result is " + (num1 + num2));
           break;
        case 2:  
            System.out.println("Please enter First Number: ");
            num1 = input.nextInt();
            System.out.println("Please enter Second Number: ");
            num2 = input.nextInt();
            if (num1 > num2)
                System.out.println("The Subtraction result is: " + (num1 - num2));
            else
                System.out.println("The Subtraction result is: " + (num2 - num1));
            break;
        case 3:                                   
            System.out.println("Please enter you Number: ");
            num1 = input.nextInt();
            System.out.println("You result is: " + (num1 * num1));
            break;
        default :   
            System.out.println("Invalid Option");
        */
   Scanner reader = new Scanner (System.in);
   char Grade;
   System.out.println("Please enter your Grade");
   Grade = reader.next().charAt(0);
    switch (Grade)
    {
        case ('A'):
            System.out.println("Excellent");
            break;
        case ('B'):
            System.out.println("Very Good");
            break;
        case ('C'):
            System.out.println("Good");
            break;
        default:
                System.out.println("Please enter valid Grade");
            
    }
    }
}



 