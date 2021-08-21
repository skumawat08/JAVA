package apniKaksha;
import java.util.Scanner;
public class Break 
{
	public static void main(String[] java)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("you must have to input values and if you give -ve input ...you will be out from the loop");
		
		for( ; ; )     //infinite loop
		{
			int x = sc.nextInt();
			if(x<0)
		         break;
			
		}
		System.out.println("you are outside from the loop");
	}
}
