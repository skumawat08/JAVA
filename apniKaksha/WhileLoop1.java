package apniKaksha;
import java.util.Scanner;
public class WhileLoop1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int reverse = 0;
		System.out.println("lastDigit  temp  reverse");
		while(temp>0)
		{
			int lastDigit = temp%10;
			temp/=10;
			reverse=reverse*10+lastDigit;
			System.out.println("   "+lastDigit+"        "+temp+"     "+reverse);
		}
		if(reverse==n) 
		{
			System.out.println(n+" is palindrome");
		}
		else
		{
			System.out.println(n+" not palindrome");
		}
	}
}
