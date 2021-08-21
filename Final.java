
public class Final {
	private final int x ;
	
	public Final()
	{
		x = 6;
		System.out.println(x);
	}
	
	public Final(int y)
	{   
		x=y;
		System.out.println(x);
		}
	public static void main(String[] args)
	{
		Final obj1=new Final();
		Final obj2=new Final(4);
	}
}
