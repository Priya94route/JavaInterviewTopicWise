package ThreadsPackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompleteableFurture {
	
	public String getName()
	{
		try
		{
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			throw new RuntimeException();
		}
		return "Hello Priya";
	}
	

	public String getLastName()
	{
		try
		{
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			throw new RuntimeException();
		}
		return "Hello Srivastava";
	}
	
	
	
	
	
	public static void main(String args[])
	{
		CompleteableFurture ob= new CompleteableFurture();
		long startTime	=System.currentTimeMillis();
		//String fname=ob.getName();
		//String lname=ob.getLastName();
		
		Callable<String> fnameCall=()->{return ob.getName();};
		Callable<String> lnameCall=()->{return ob.getLastName();};
		
		ExecutorService executor=Executors.newFixedThreadPool(2);
		Future<String >f=executor.submit(fnameCall);
		Future<String>l=executor.submit(lnameCall);
		
		//String fullname=fname+lname;
		String fullname="";
		try {
			 fullname = f.get()+l.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(fullname);
		System.out.println("Time taken to execute "+(System.currentTimeMillis()-startTime));
	}

}
