 
import java.util.LinkedHashMap;

public class StringOccurrence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Bhimashankar Bhimashankar Temple Bhimashankar";
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

         
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            
            if (ch == ' ' || i == s.length() - 1) {
                if (ch != ' ') {
                    word += ch;  
                }
                
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

        
        System.out.println("Unique words:");
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key); 
            }
        }

        System.out.println("Duplicate words:");
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key);  
            }
        }
	}

}
