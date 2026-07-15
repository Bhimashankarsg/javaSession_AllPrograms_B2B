 
import java.util.LinkedHashMap;

public class stringOccurence {

	public static void main(String[] args) {
		String s = "Bhimashankar Bhimashankar Temple Bhimashankar";
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		String word = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			 
			if (ch == ' ' || i == s.length() - 1) {
				if (ch != ' ') {
					word += ch;  
				}
				// Process the word
				if (!word.isEmpty()) {
					Integer count = map.get(word);  
					if (count == null) {
						map.put(word, 1);  
					} else {
						map.put(word, count + 1);  
					}
				}
				word = "";  
			} else {
				word += ch;  
			}
		}

		// Print the result
		System.out.println(map);
	}

}
