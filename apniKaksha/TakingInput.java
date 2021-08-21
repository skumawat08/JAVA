package apniKaksha;
import java.util.Scanner;
public class TakingInput {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();    //send a message to user for give inputs
		int principal=sc.nextInt();
		float rate=sc.nextFloat();
		int time=sc.nextInt();
	
		float simpIntr= principal*rate*time/100;
		
		System.out.println("simple interest is:"+ simpIntr);
		
		sc.close();
	}

}
