package apniKaksha;

public class BitwiseOperator {
	
	public static void main(String[] args)
	{
		int a=5;
		int b=13;
		/*int c=a|b;  //OR operation
		int d=a&b;  //AND operation */
		
		int c=b<<2;  //Left shift  1101 -->110100  ==>   32+16+4=52
		int d=b>>2;  //Right shift 1101 -->0011    ==>   3
		 
		System.out.println(d);
		System.out.println(c);
		
		System.out.println(a!=b); //comparison operator    ---- not-equal-to opera
		
	
		
		
		
		
		
	}

}
