
public class longestString {

	public static void main(String[] args) {
		 
		String str="abciexyzduiabcdabacdxyzd";
		
		int n=str.length();
		String longestSubString=" ";
		int maxRepeatLength=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int k=0;
				while(j+k<n && str.charAt(i+k)==str.charAt(j+k))
				{
					k++;
				}
				
				if(k>maxRepeatLength)
				{
					maxRepeatLength=k;
					longestSubString=str.substring(i,i+k);
				}
			}
		}
		System.out.println("Longest repeated substring "+longestSubString);
	}

}
