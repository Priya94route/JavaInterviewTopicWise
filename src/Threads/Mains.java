package Threads;

import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
public class Mains {
	
	
public	static int maxSum(int arr[])
	{   //  l  r  
		// 2 -3 4 -1 -1 2 1 -5 4
		int sum=0;
		int maxSum=0;
		int l=0;
		//int r=0;
		for(int r=0;r<arr.length;++r)
		{
			sum=sum+arr[r];
            maxSum=Math.max(maxSum, sum);  //2 -3
            
            if(sum<0)
            {
            	sum=0;
            }
            
            
            
			
			
		}
		
		return maxSum;
		
		
		
		//return 0;
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		 int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		 int arr1[]= {5, -2, 3, 4};  //10
		 int arr2[]= {-2,1,-3,4,-1,2,1,-5,4};
		 int arr3[]= {2,-5,7,-1,3};
		 int arr4[]= {8,-19,5,-4,20};

	     int ans=   Mains.maxSum(arr4);
	     System.out.println(ans);
	      	
		
		String str="PPrrriya";
		System.out.println(str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(d->d,Collectors.counting())));	
		
		Map<Character, Long> mp=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(d->d,Collectors.counting()));
		Entry<Character, Long> en=mp.entrySet().stream().sorted(Comparator.comparing(Entry::getValue,Comparator.reverseOrder())).skip(1).findFirst().get();
	   System.out.println(en);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}




	private static void maxSubArray(int[] arr) {
		// TODO Auto-generated method stub
		
	}

}
