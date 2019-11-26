

package forloop;
import java.util.Scanner;

public class Forloop {

    
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    /*
    float Avg;
    int Grade, sum = 0;
    int counter = 1;
    
    for (; counter <= 6;  counter++)
        
     {     
        System.out.println("Please enter your Grade");
        Grade = input.nextInt();
        sum += Grade;
      }
    
    System.out.println(counter);
    Avg = (sum / counter);
    System.out.println("The average of all Grades is equal" + Avg);
     */   
     
    
    /* 
    for (int i = 0; i<=10; i ++)
    System.out.println(i);
    
    */
      
    
    /* 
    for (int i = 10; i >= 0; i--) 
     System.out.println(i);
    */
    /*
    
    for (int i=2; i<=20; i++)
    { 
        if (i %2 ==0)
               System.out.println(i);
    */
   
    /*
    int counter = 1, num, odd=0, even=0;
    while (counter <= 10)
    {
        System.out.println("Please enter your number");
        num = input.nextInt();
        counter ++;
        if (num %2 ==0)
            even +=num;
        else
            odd +=num;
    }
    System.out.println("The sum of even numbers is equal to "+even);
    System.out.println("The sum of odd numbers is equal to "+odd);
    */
  for (int j=1; j<=5; j++)  
  {   
    int Factorial=1, num;
    System.out.println("Please enter your number to calculate facorial");
    num = input.nextInt();
        if (num >0)
        {  for (int i =1; i<=num; i++)
            {
                Factorial = Factorial * i;             
               
            }
            System.out.printf("Your Factorial number of %d is ", num); 
            System.out.println(Factorial);
        }
        else
            System.out.println("Please enter a positive number");
  } 
    
}  
    } 

