/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third.pkgwhile.loop;
import java.util.Scanner; 
/**
 *
 * @author DatumCo
 */
public class ThirdWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int Counter = 1, sum = 0, Grade = 0;
    while (Counter <= 5 && Grade!= -1)
    {
        System.out.println("Please Enter your Grade: ");
        Grade = input.nextInt();
        sum += Grade;
        Counter ++;
    }
    System.out.printf("The Average of Total Grades is equal to %d", sum/Counter);





// TODO code application logic here
    }
    
}
