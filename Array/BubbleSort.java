package Array;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {7,5,4,1,-3,2,0};
		int n = a.length;
		
		for(int i=0;i<n-1;i++)
		{
			boolean sorted = true;   //this is used for reduce loop iterations if the array is almost  sorted
			for(int j=0;j<n-1-i;j++)//for(int j=0;j<n-1;j++)
			{
				if(a[j+1]<a[j])
				{
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
				
				sorted = false;
				}
			}
			if(sorted)
				break;
		}
		//this is for each loop or enhanced for loop
		for(int item: a)        //here the items are the elements of sorted array a[]
		{
			System.out.print(item+" ");
		}
	}

}
