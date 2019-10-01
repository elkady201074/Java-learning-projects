/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayoutput;

import java.util.Scanner;

public class Displayoutput {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int Grade;
    System.out.println("Please enter your Grade: ");
    Grade = input.nextInt();
    if (Grade >= 90 && Grade <= 100)
        System.out.println("Cngrats you scoored A");
    else if (Grade <= 80 && Grade > 70)
        System.out.println("Congrast you scoored B");
    else if (Grade <= 70 && Grade > 60)
        System.out.println("Congrats you scoored C");
    else if (Grade <= 60 && Grade >= 0)
        System.out.println("You Failed");
    else 
        System.out.println("You Grade is out of range");
     
    }
}
