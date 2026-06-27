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
	  
	  
	  
	  //Q2 Maximum sum subarray of size k
	 static  int  MaxSumK(int arr[],int k)
	  {
		 // int maxSum=Integer.MAX_VALUE;
		  int maxSum=0;
		  int sum=0;
		  
		  for(int i=0;i<k;++i)
		  {
			sum=sum+arr[i];  
		  }
		  //1 2 3 4 5
		  for(int j=k;j<arr.length;++j)
		  {
			  sum=sum-arr[j-k];
			  sum=sum+arr[j];
			  maxSum=Math.max(maxSum, sum);
		  }
		  return maxSum;
		  
		  
		  
	  }
	        

	    


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   String s = "dbcaa";
	        int ans = lengthOfLongestSubstring(s);
	        System.out.println(ans);
		    int sum=MaxSumK(new int[]{5,1,2,10,1}, 2);
		    System.out.println(sum);
	}

}
