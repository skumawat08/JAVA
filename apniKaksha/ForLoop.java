
package apniKaksha;
import java.util.Scanner;
public class ForLoop
//sum of series 2........series is: 1-1/2+1/3-1/4+1/5-........1/n
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float result=0;
		for(float i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				result-=1/i;
			}
			else
			{
				result+=1/i;
			}
		}
		System.out.println("Result is: "+result);
	}
}
//sum of series ...series is: 1+1/2+1/3+1/4+......+1/n
/*{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		float result = 0;
		for(float i=1;i<=n;i++)
		{
			result+= 1/i;  //result = result+1/i;
		}
		System.out.println("Result is "+ result);
	}
}
//prime number .... and 1 is not a prime  number
/*{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		if(n<2)
		{
			isPrime = false;

		}
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime = false;
				break;
			}
			
		}
		System.out.println("isPrime "+ isPrime);
	}
	
}
//fabonacci series : 0 1 1 2 3 5 8 13.......(n-2)+(n-1)
/*{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values in fabonacci series");
		int n = sc.nextInt();
		System.out.println("Enter first value");
		int a = sc.nextInt();
		System.out.println("Enter second value");
		int b = sc.nextInt();
		System.out.print("\n"+a);
		System.out.print(" "+b);
		for(int i=0;i<n-2;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		
	}
}
//factorial
/*{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int factorial=1;
		for(int i=n;i>1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println("factorial of "+ n +" is "+ factorial);
	}
}*/
//Sum of n numbers
/*{   
	
	
	public static void main(String[] args)
	{
		int sum =0;
		
		//for(int i=1;i<100;i=i+2)
		for(int i=1;i<=5;i++)
		{
			sum = sum+i; 
			System.out.println(+i);
		}
		  	
		System.out.println("\n"+sum);
	}
}*/
