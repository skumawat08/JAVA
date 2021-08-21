package Array;
import java.util.Scanner;
public class AdditionOfMatrix 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows of matrix");
		int rows = sc.nextInt();
		System.out.println("Enter the cols of matrix");
		int cols = sc.nextInt();
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		System.out.println("Enter the elements of matrix a");
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<cols;j++)
        	{
        		a[i][j]=sc.nextInt();
        	}
        }
        System.out.println("Enter the elements of matrix b");
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<cols;j++)
        	{
        		b[i][j]=sc.nextInt();
        	}
        }
	/*System.out.println("The matrix a is:");
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("The matrix b is:");
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	} */
        System.out.println("the addition of matrix a and b");
       int c[][] = new int[rows][cols];
       for(int i=0;i<rows;i++)
       {
       	for(int j=0;j<cols;j++)
       	{
       		c[i][j]=a[i][j]+b[i][j];
       	}
       }
       for(int i=0;i<rows;i++)
       {
       	for(int j=0;j<cols;j++)
       	{
       		System.out.print(c[i][j]+" ");
       	}
       	System.out.println();
       }
	}
}
