package Array;

public class SelectionSort {

	public static void main(String[] args) {
		/*unsorted array 
		 *     5 2 -1 6 3
		 * 1) -1 2  5 6 3
		 * 2) -1 2  5 6 3
		 * 3) -1 2  3 6 5
		 * 4) -1 2  3 5 6    (n-1)th iteration
		 */
         int a[] = {7,2,-1,-3,0};
         int n = a.length;
         
         for(int i=0;i<n-1;i++)
         {
        	 int minInd=i;
        	 for(int j=i;j<n;j++)
        	 {
        		 if(a[j]<a[minInd])
        			 minInd=j;
        	 }
        	 int temp = a[i];
        	      a[i] = a[minInd];
        	      a[minInd]=temp;
         }
         //enhanced for loop or for each loop
         for(int item: a)
         {
        	 System.out.print(item+" ");
         }
	}

}
