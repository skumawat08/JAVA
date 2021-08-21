package linkedLists;
//import java.util.*;

public class MainLinkedLists {

	public static void main(String[] args) {
		
		MyLinkedList mll = new MyLinkedList();
		
//		mll.add(40);
//		mll.add(25);
		for(int i=0;i<100;i=i+10) {
			mll.add(i);
		}
		mll.display();
	}
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		
//         getTimeDiff(al);
//         getTimeDiff(ll);
//         
//	}
//	
//		static void getTimeDiff(List<Integer> list)
//		{
//			long start = System.currentTimeMillis();
//			
//			for(int i=0;i<100000;i++)
//			{
//				list.add(0,i);
//			}
//			
//			long end = System.currentTimeMillis();
//			
//			System.out.println(list.getClass().getName()+"-->"+(end-start));
//		}
}
