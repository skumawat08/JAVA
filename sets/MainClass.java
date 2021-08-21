
package sets;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		Set<String> fruits = new  HashSet<>();
		       fruits.add("apple");
		       fruits.add("banana");
		       System.out.println(fruits.add("kiwi"));
		       System.out.println(fruits.add("banana"));
		       System.out.println(fruits);
		       

	}

}
