/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.rectangle;

import java.util.Scanner;
public class AreaOfRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
   //This program calculates rectangle area
   int Width, Length, Area;
   System.out.println("Please enter the rectangle Width");
   Width = input.nextInt();
   System.out.println("Please enter the rectangle Length");
   Length = input.nextInt();
   Area = Length * Width;
   System.out.printf("The Area of the rectangle is %d", Area);
   /* 
   // This program is calculating the Net Salary
   String Fname; Float Salary, Net_Salary;
   System.out.println("Please Enter your First Name");
       Fname = input.next();
    System.out.println("Please enter your Salary");
        Salary = input.nextFloat();
    Net_Salary = Salary - (0.10f * Salary);
    System.out.printf("Mr %s your Net Salary is %f", Fname, Net_Salary);
*/
    }
    
}
