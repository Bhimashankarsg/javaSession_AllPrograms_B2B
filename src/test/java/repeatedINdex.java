 
import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;

public class repeatedINdex {

	public static void main(String[] args) {
		
		int[] a = { 0,1, 2, 3, 4, 1, 2, 3, 3,0,1,0 };
		LinkedHashMap<Integer, ArrayList<Integer>> map = new LinkedHashMap();
		for (int i = 0; i < a.length; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], new ArrayList());
			} 
			map.get(a[i]).add(i);
		}
		
		for(Map.Entry<Integer,ArrayList<Integer>> list:map.entrySet())
		{
			if(!list.getValue().isEmpty()) {
				System.out.print(list.getKey());
				System.out.println(list.getValue());
			}
		}
	}

}
