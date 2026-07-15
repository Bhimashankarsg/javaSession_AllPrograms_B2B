
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ArrayListOccurrence {

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
                map.put(element, 1);  
            } else {
                map.put(element, count + 1);  
            }
        }
 
        System.out.println(map);
	}

}
