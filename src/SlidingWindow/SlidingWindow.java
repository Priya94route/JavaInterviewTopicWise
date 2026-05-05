package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
	
	
	  public static int lengthOfLongestSubstring(String s) {
	        // TODO: Implement logic here
	        //abcabc
	        int result = 0;
	        int left=0;
	        int max=0;
	        Set<Character> set=new HashSet<>();
	        for(int right=0;right<s.length();right++)
	        {
	        	
	        	while(set.contains(s.charAt(right))) {
                   	set.remove(s.charAt(left));
                   	left++;
	        	}
	        	
	        	if(!set.contains(s.charAt(right)))
	        		{
	        		set.add(s.charAt(right)); //dbca a r=3 l=0
	        		//right++;
	        		}
	        	
	        	
	        	
	        	max=Math.max(max, right-left+1);
	        }
	        return max;
	   }
	        

	    


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   String s = "dbcaa";
	        int ans = lengthOfLongestSubstring(s);
	        System.out.println(ans);
		
	}

}
