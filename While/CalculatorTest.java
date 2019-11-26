import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
	
	/*	
	Scanner reader = new Scanner (System.in);
	
	int choice, num1, num2;
	System.out.println("Please choose one option:");
	System.out.println("1- Add two numbers");
	System.out.println("2- Get the subtract of two numbers");
	System.out.println("3- Get the square of a number");
	
	choice = reader.nextInt();
	switch (choice)
	{
	case 1:
		System.out.println("Please enter two numbers");
		num1 = reader.nextInt();
		num2 = reader.nextInt();
		System.out.printf("Your result is equal to %d", (num1 + num2));
		break;
	
	case 2:
		System.out.println("Please enter two numbers");
		num1 = reader.nextInt();
		num2 = reader.nextInt();
		System.out.printf("Your result is equal to %d", (num1 * num2));
		break;
	
	case 3:
		System.out.println("Please enter your number");
		num1 = reader.nextInt();
		System.out.printf("Your result is equal to %d", num1 * num1);
		break;
		
	default:
		System.out.println("Please enter a valid choice");
		
	}
		
	*//*
	Scanner reader = new Scanner(System.in);
	
	char letter;
	System.out.println("Please enter your letter:");
	letter = reader.next().charAt(0);
	switch (letter)
	{
		case 'a':
		case 'e':
		case 'o':
		case 'u':
		case 'i':
			System.out.println("This letter is vowl letter");
			break;
		default:
			System.out.println("This is conconant letter");
	
	}
	
	
	
		*/
		Scanner input = new Scanner(System.in);
		
		int Grade= 0, i = 1, Avg, Total = 0;
		while (i <= 10)
		{
			System.out.println("Please enter your Grade");
			Grade = input.nextInt();
			Total += Grade;	
			i++;
		}
		Avg = Total / 10;
		System.out.println("The average of the Grades is " + Avg);
		
		
		
	}

}
