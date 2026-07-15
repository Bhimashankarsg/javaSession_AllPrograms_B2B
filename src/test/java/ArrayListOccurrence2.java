
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ArrayListOccurrence2 {

	public static void main(String[] args) {
		
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("apple");
        
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

       
        for (String element : list) {
            Integer count = map.get(element);  
            if (count == null) {
                map.put(element, 1); // Initialize count to 1 if not present
            } else {
                map.put(element, count + 1); // Increment the count
            }
        }

     
        System.out.println("Unique elements:");
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key); // Print unique elements
            }
        }

        System.out.println("Duplicate elements:");
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key); // Print duplicate elements
            }
        }
	}

}
