package apniKaksha;
import java.util.Scanner;
public class Continue 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number:");
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			if(i>=41&&i<=50)
				continue;
			System.out.println(i);
		}
		
	}
}
