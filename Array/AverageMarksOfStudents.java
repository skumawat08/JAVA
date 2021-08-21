package Array;
import java.util.Scanner;
public class AverageMarksOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number of students");
		int n = sc.nextInt();
		int marks[] = new int[n];
		
		System.out.println("Enter the marks of students");
		for(int i=0;i<n;i++)
		{
			marks[i] = sc.nextInt();
		}
		sc.close();
		double average = 0;
		for(int i=0;i<n;i++)
		{
			average+= marks[i];
		}
		average/=n;
		System.out.println("average marks is: "+average);
	}

}
