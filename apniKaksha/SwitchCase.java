package apniKaksha;

import java.util.Scanner;
public class SwitchCase 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();
		String s;
		
		switch(x)
		{
			case 1:
			case 2:           //merge cases case 1 and case 2
				//s = "sunday";
				//break;
			//case 2:
				s = "monady";
				break;
			case 3:
				s = "tuesday";
				break;
			case 4:
				s = "wednesday";
				break;
			case 5:
				s = "thrusday";
				break;
			case 6:
				s = "friday";
				break;
			case 7:
				s = "saturday";
				break;
			default:
				s = "Unknown Day";
				
				//System.out.println("Invalid Input");
				
		}
		
		System.out.println("Today is "+ s);
		sc.close();
	}
}
