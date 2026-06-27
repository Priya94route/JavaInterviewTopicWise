package ArraysRelatedNotINanCategory;

import java.util.Arrays;

public class MyMain {

	static void reverse(int arr[],int s,int e)
	{
	while(s<e)
		{
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
		System.out.println("reverse func");
		for(int i:arr)
		{
			
		//	System.out.println(i);
			
		}

	}
	
	
	public void rotateArrayByK(int arr[],int k)
	{
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		for(int i:arr)
		{
			//System.out.println(i);

					}//System.out.println("After this k");

		
		//reverse(arr,0,arr.length-1);
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	//	System.out.println(Arrays.toString(arr));
	}
	
	
	void moveZeroesToEnd(int arr[])
	{
		int j=0;
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i]!=0)
			{
				arr[j]=arr[i];
				j++;
			}
		}
		while(j<arr.length)
		{
			arr[j]=0;
			j++;
		}
		

	    for(int x : arr)
	    {
	        System.out.print(x + " ");
	    }
	}
	
	
//	Find subarray with given sum
	
//	[1,2,3,7,5] 12
	void subarraySum(int arr[],int target)
	{
		int l=0;
		int sum=0;
		for(int r=0;r<arr.length;++r)
	    {
			sum=sum+arr[r];
			while(sum>target)
			{
				sum=sum-arr[l];
				l++;
				
			}
			if(sum==target)
			{
				System.out.println("sub start l"+l +"subarra end r"+r);
			}
			
	    }
	}
	
	
	boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;++i)
		{
			if(n%i==0)
				return false;
		
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	MyMain ob=new MyMain();
		new MyMain().rotateArrayByK(new int[] {1,2,3,4,5,6,7,8},3);

	    int arr[] = {1,0,2,0,3,4,0};

	    ob.moveZeroesToEnd(arr);
		
		
	}

}
