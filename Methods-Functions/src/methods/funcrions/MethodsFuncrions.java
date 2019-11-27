/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods.funcrions;
import java.util.Scanner;

public class MethodsFuncrions {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    /*
    System.out.println("Start of the prog");
    drawline('*');
    
    System.out.println("Welcome to the first lecture on Functions");
    drawline('#');
    
    System.out.println("End of the prog");
      }
    public static void drawline(char ch)
    {
    for (int i = 1;i<=10;i++)
        {
        System.out.print(ch);
        }
    System.out.println();
    */
    
    /*
    //Method with changed length
    System.out.println("Start of the prog");
    drawline('*',40);
    
    System.out.println("Welcome to the first lecture on Functions");
    drawline('#',2);
    
    System.out.println("End of the prog");
    */ 
    int x = 50, i = 100, Result;
    Result = sum(x,i);
    System.out.println(Result);
    
    }
   //Sum Function
    public static int sum(int x,int y)
    {
    int result = 0;
    result = x + y;
    return result;
    } 
    
    
    public static void drawline(char ch,int length)
    {
    for (int i = 1;i<=length;i++)
        {
        System.out.print(ch);
        }
    System.out.println();
    }
   
    
    
    }
   

    
    

