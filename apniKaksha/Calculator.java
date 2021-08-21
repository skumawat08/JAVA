package apniKaksha;
import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first digit");
		
		int x = sc.nextInt();
		
		System.out.println("Enter second digit");
		
		int y = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the operation");
		char operation = sc.nextLine().charAt(0);
		int result = 0;
		
		switch(operation)
		{
		case '+':
			result = x+y;
			break;
		case '-':
			result = x-y;
			break;
		case '*':
			result = x*y;
			break;
		case '/':
			result = x/y;
			break;
		default:
			System.out.println("Invalid Operation");
		}
		System.out.println("Result is: "+ result);  
	}
}
