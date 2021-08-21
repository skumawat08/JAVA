package apniKaksha;

import java.util.Scanner;

class TakingInput1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String y = sc.nextLine();
		
		String x = sc.nextLine();
		
		System.out.println(y+"  "+x);
		
		sc.close();
	}
}