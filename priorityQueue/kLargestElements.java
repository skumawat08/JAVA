package priorityQueue;
import java.util.*;
//import java.io.*;
public class kLargestElements {

	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of test cases");
		int t = sc.nextInt(); //number of test cases
		while(t--!=0) {
			System.out.println("enter number of elements of array");
			int n = sc.nextInt(); //number of elements of array
			System.out.println("enter numbers of k largest elements");
			int k = sc.nextInt(); //number of elements to add in priority queue
			int a[] = new int[n]; //array or elements
			System.out.println("enter elements of array");
			for(int i =0; i<n;i++) {
				a[i] = sc.nextInt();
			}
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for(int i=0; i<n;i++) {
				if(i<k) {
					pq.add(a[i]);
				} else {
					if(pq.peek()<a[i]) {
					
						
						
						
						pq.poll(); //remove peek element from priority queue
						pq.add(a[i]);
					}
				}
			}
		
		ArrayList<Integer> ans = new ArrayList<>(pq);
		Collections.sort(ans, Collections.reverseOrder());
		for(int x: ans) {
			System.out.print(x+" ");
		}
		System.out.println();
		}
	}
}
