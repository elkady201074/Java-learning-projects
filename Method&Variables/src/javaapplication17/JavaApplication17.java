
package javaapplication17;
import java.util.Scanner;

public class JavaApplication17 {

   
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    System.out.println("Please enter your three numbers:");
    int n1 = input.nextInt();
    int n2 = input.nextInt();
    int n3 = input.nextInt();
    int sum = sum (n1,n2,n3);
    double Average = Average(n1, n2, n3);
    display(sum, Average);
    
    }
    
    //Func to count sum
    public static int sum (int n1, int n2, int n3)
    {
    int sum = n1 + n2 + n3;
    return sum;
    }     
    
    //Func to count average
    public static double Average (int n1, int n2, int n3)
    {
    double Average = (sum (n1,n2,n3)/3);
    return Average;
    }
    
    //Fuc to display
    public static void display (int s, double a)
    {
    System.out.println("The sum of the three numbers is equal to" + s);
    System.out.println("The average of the three numbers is equal to" + a);
    }
        
    }
    

