package apniKaksha;
import java.util.Scanner;
public class NestedForLoop1 
{
   //table
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("Enter any number: ");
		//int n = sc.nextInt();
		int table=0;
		for(int j=1;j<=20;j++)
		{
		     int n = j;
		for(int i=1;i<=10;i++)
		{
			table = n*i;
			System.out.print(table+ " ");
		}
		System.out.print("\n");
		}
	}
}
