 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class occurenceofcharacterArrayList {

	 
	public static void main(String args[])
	{
		Character  a[]={'w','r','c','b','p','r'};
		List<Character> list = new ArrayList<Character>(Arrays.asList(a));
		 List<Character> uniqueList = new ArrayList<Character>();
	        
	        for (Character ch : list) {
	            if (!uniqueList.contains(ch)) {
	                uniqueList.add(ch);
	                System.out.println(ch + "==" + Collections.frequency(list, ch));
	            }
	        }
	    }
	}
		
		