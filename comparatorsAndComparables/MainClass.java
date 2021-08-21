package comparatorsAndComparables;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(23,"hemant"));
		students.add(new Student(11,"mehul"));
		students.add(new Student(10,"amit"));
		students.add(new Student(55,"saransh"));
		students.add(new Student(11,"amit"));
	/*
	*  Collections.sort(students, new SortByNameThenMarks()); //we can create an anonymous class 
	 instead of creating a new class
			 */
//		Collections.sort(students, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.name.equals(o1.name)) {
//					return o1.marks - o2.marks; //this will return -ve or +ve value according marks
//				} else {
//					return o1.name.compareTo(o2.name);
//				}
//			}
//			
//		});
		
		//lets know the functionality of lambda "->" this arrow introduce lambda
		  // in the lambda we not need to define the comparator and no need to tell the 
		// object type
		/*Collections.sort(students, (o1, o2) -> {
				if(o1.name.equals(o1.name)) {
					return o1.marks - o2.marks; //this will return -ve or +ve value according marks
				} else {
					return o1.name.compareTo(o2.name);
				}
			} ); */
		
		//if you want to sort according  to name only
		/*Collections.sort(students, (o1,o2) -> o1.name.compareTo(o2.name));
			*/
		//if you want to sort according to name then marks in reverse order
		//the is only one line implementation according lambda
		Collections.sort(students, Comparator.comparing(Student::getName)
				.thenComparing(Student::getMarks).reversed());
		
	
		students.forEach(System.out::println); //this loop is the property of lambda
	}

}

//class SortByNameThenMarks implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		if(o1.name.equals(o1.name)) {
//			return o1.marks - o2.marks; //this will return -ve or +ve value according marks
//		} else {
//			return o1.name.compareTo(o2.name);
//		}
//	
//	}
//	
//}