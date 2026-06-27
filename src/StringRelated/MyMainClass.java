package StringRelated;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class MyMainClass {
	
	
	 public static List<List<String>> groupAnagrams(String[] strs) {
	        
		 HashMap<String,List<String>> hm=new HashMap<>();
		 for(String s:strs)
		 {
			 int arr[]=new int[26];
			 for(char ch:s.toCharArray())
			 {
				
				 ++arr[ch-'a'];
			 }
			 String key=Arrays.toString(arr);
			 hm.putIfAbsent(key, new ArrayList<>());
			hm.get(key).add(s);
			 
			 
		 }
		List<List<String>> res= hm.entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
	 return res; 
	 }

	
	public static boolean isAnagram(String s, String t) {
	      int arr[]=new int[26];
	      if(s.length()!=t.length())
	      return false;

		/*
		 * for(char ch:s.toCharArray()) { arr[ch-'a']= ++arr[ch-'a'];
		 * 
		 * }
		 */
	     // System.out.println(Arrays.toString(arr));
	      
	       for(int i=0;i<s.length();++i)
	      {
	        ++arr[s.charAt(i)-'a'];
	        -- arr[t.charAt(i)-'a'];
	      }
	       System.out.println(Arrays.toString(arr));

	      for(int i:arr)
	      {
	        if(i!=0)
	        return false;
	      }
	  

	    
	     return true;
	    }
	
	
	  public static int[] twoSum(int[]arr, int target)
		{
		  
			
		  
		  HashMap<Integer,Integer> hm=new HashMap<>();
		   int complement=0;
		  for(int i=0;i<arr.length;++i)
		  {
			   complement=target-arr[i];
			   if(hm.containsKey(complement))
			   {
				   System.out.println(hm.get(complement)+" "+i);
				   return new int[] {hm.get(complement),i};
				   
			   }
			   hm.put(arr[i],i); //3
			}
		 
			   
		  
			
		  return new int[] {-1, -1};
			
		}
	  
	  
	  public static int[] topKFrequent(int[] nums, int k) {
	        
		  int res[]=new int[k];
		  HashMap <Integer,Integer> hm= new HashMap<>();
		  
		  for(int n:nums)
		  {
			  hm.put(n, hm.getOrDefault(n,0)+1);
		  }
		  System.out.println(hm);
		  List<Integer[]> li = new ArrayList<>();
		  for(Map.Entry<Integer, Integer> set:hm.entrySet())
		  {
			  li.add(new Integer[] {set.getKey(),set.getValue()});
		  }
		  
		  li.sort((a,b)->b[1]-a[1]);
		//  int i=0;
		  for (int i = 0; i < k; i++) {
	            res[i] = li.get(i)[0];
	        }
		  //li.sort(null);
		  System.out.println(Arrays.toString(res));
		  return res;
	    }
	  
	  public int longestConsecutive(int[] nums) {
		  
		  //store all numbers in hashset
		  //
	        return 0;
	    }
	  
	  
	  public static int longestSubstringwithoutRepeating(String s) {
		  
		  int l=0;
		 // int r=0;
		  int max=Integer.MIN_VALUE;
		  HashSet <Character> hs= new HashSet<Character>();
		  for(int r=0;r<s.length();++r)
		  {
			  if(hs.contains(s.charAt(r)))
			  {
				  while(hs.contains(s.charAt(r)))
				  {
					  hs.remove(s.charAt(l));
					  l++;
				  }
			  }
			  
			  hs.add(s.charAt(r));
			  max=Math.max(max,hs.size());
			  
		  }
			  
	        return max;
	    }
	  
	  
	  
	  // 
		/*
		 * You are given two strings s1 and s2. Return true if s2 contains a permutation
		 * of s1, or false otherwise. That means if a permutation of s1 exists as a
		 * substring of s2, then return true. Both strings only contain lowercase
		 * letters.
		 */
	  
	  public static boolean isPermuationPresent(String s1,String s2)
	  {
		  char arr []=s1.toCharArray();
		  Arrays.sort(arr);
	      String sortedS1=Arrays.toString(arr);
	      System.out.println(sortedS1);
	      int k=s1.length();
	      System.out.println(s1);
		  for(int i=0;i<s2.length()-s1.length()+1;++i)
		  {
			  if(sortedS1.equals(sortString(s2.substring(i,k+i))))
			  {
				  System.out.println(s1+" and s2"+s2);
				     return true;
				  
			  }
		  }
		  
		  return false;
			  
	  }
	  
	  public static String sortString(String s1)
	  {
		  
		  char arr []=s1.toCharArray();
		  Arrays.sort(arr);
	      String sortedS1=Arrays.toString(arr);
	      System.out.println(sortedS1);
	      return sortedS1;
	      
	  }
	  
	  
	  public static void main(String args[])
	  {
		boolean b=  MyMainClass.isAnagram("carrat", "ararac");
		MyMainClass.twoSum(new int[] {3,4,5,6},7);
		System.out.println("anagram"+b);
		MyMainClass.groupAnagrams(new String[]{"carrat", "ararac","abc","cab"});
		MyMainClass.topKFrequent(new int[] {3,3,3,4,4,5,6},2);
		boolean isPresent=MyMainClass.isPermuationPresent("cab", "sasabacdd");
		System.out.println(isPresent);
		
		int max=MyMainClass.longestSubstringwithoutRepeating("abcdajka");
		System.out.println(max);
		Runtime.getRuntime().availableProcessors(); 
		
		
		
		
	  }
}
