 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class OccurenceOfAnagram {

 
 
		    public static void main(String[] args) {
		        
		        String str="butasdftubsilenttnelissdf";
		        String subst="listen";
		        int count=0;
		        LinkedHashMap<String,ArrayList<Integer>> map=new LinkedHashMap();
		        
		        for(int i=0;i<str.length()-5;i++)
		        {
		            String sub=str.substring(i,i+6);
		            char ch1[]=sub.toCharArray();
		            char ch2[]=subst.toCharArray();
		            Arrays.sort(ch1);
		            Arrays.sort(ch2);
		            if(Arrays.equals(ch1,ch2))
		            {
		                count++;
		                System.out.println(sub+count);
		            }
		        }
		    }
		

	

}
