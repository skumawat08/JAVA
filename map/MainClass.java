package map;
import java.util.*;
import java.util.Map.Entry;
public class MainClass {

	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<>();
				
				numbers.put("one", 1);
				numbers.put("two", 2);
				numbers.put("five", 5);
				
				numbers.putIfAbsent("three", 3);
				
				numbers.replace("five", 7);
				
				//numbers.remove("two");  //remove the pair associated with key two
				
				numbers.remove("two", 4); //remove the association only if the key "two" associated with the value 4
				System.out.println(numbers);
				
				System.out.println(numbers.getOrDefault("six", 99));
					
				System.out.println(numbers.keySet()); //returns set of keys
				System.out.println(numbers.values()); //return set of values
				System.out.println(numbers.entrySet()); //return all entries
				
				Set<Entry<String, Integer>> entries = numbers.entrySet();
				
				for(Entry<String, Integer> entry: entries) {
					entry.setValue(entry.getValue()*100);
				}
				
				System.out.println(numbers);
				System.out.println(entries); 
				
	}

}
