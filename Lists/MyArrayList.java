package Lists;

import java.util.ArrayList;

import java.util.List; 

public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>(); 
		
		fruits.add("apple");
		fruits.add("mango");
		
		System.out.println(fruits);
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(45);
		
		//this is called the generics .....generics is used to give miltiple type support to and pair and 
		//used to specifies the type of a list
		
		Pair<String, Integer> p1 = new Pair<>("saransh", 50);
		Pair<Boolean,String> p2 = new Pair<>(true,"hello");
		
		p1.getDescription();
		p2.getDescription();
	}

}
