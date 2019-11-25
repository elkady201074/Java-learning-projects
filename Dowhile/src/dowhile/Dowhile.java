
package dowhile;

import java.util.Scanner;

public class Dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       
      /*
      int Grade = 0, sum = 0, Avg = 0, counter = 0;
        do {
            System.out.println("Please enter your Grade:");
            Grade = input.nextInt();
            sum += Grade;
            counter++;
            System.out.println(counter);
            }
        while (counter < 6);
        System.out.println(counter + " ");
        Avg = sum / counter;
        System.out.printf("Averga of all Grades is equal to %d", Avg);
       */
      int option, first, second;
      do {
          System.out.println("Please choose one Option from the MENU:");
          System.out.println("1- Sum two numbers");
          System.out.println("2- Subtract two numbers");
          System.out.println("3- Divide two numbers");
          System.out.println("0- To EXIT");
          option = input.nextInt();
          switch (option)
          {
              case 1:
              {
                  System.out.println("Please enter first number");
                  first = input.nextInt();
                  System.out.println("Please enter second number");
                  second = input.nextInt();
                  System.out.printf("The result of summation is %d", (first+second));
                  break;
              }
          
              
              case 2:
              {
                  System.out.println("Please enter first number");
                  first = input.nextInt();
                  System.out.println("Please enter second number");
                  second = input.nextInt();
                  System.out.printf("The result of subtraction is %d", (first-second));   
                  break;        
              }
              case 3:
              {
                  System.out.println("Please enter first number");
                  first = input.nextInt();
                  System.out.println("Please enter second number");
                  second = input.nextInt();
                  System.out.printf("The result of subtraction is %d", (first/second)); 
                  break;          
              } 
              case 0:
              {
              System.out.println("Goodbye");
              break;
              }
              default :
                {
                  System.out.println("Please choose a valid option");
                  break;
                }
          }
      } while (option != 0);
      }
    }

