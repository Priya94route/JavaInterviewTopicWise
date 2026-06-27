package ThreadsPackage;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class CompletableFututreDEMO {
	
	
	
	public String getName()
	{
		try
		{
			Thread.sleep(7000);
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
			Thread.sleep(4000);
		}catch(InterruptedException e)
		{
			throw new RuntimeException();
		}
		return "Hello Srivastava";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime	=System.currentTimeMillis();
		
		ExecutorService executor= Executors.newFixedThreadPool(2);
		CompletableFututreDEMO ob=new CompletableFututreDEMO();
		CompletableFuture<String> fname=CompletableFuture.supplyAsync(()->ob.getName(),executor).exceptionally(e->e.getMessage());
			//	CompletableFuture.supplyAsync(()->ob.getName()).thenAccept(s->System.out.println(s));
	
				
		CompletableFuture<String> lname=CompletableFuture.supplyAsync(()->ob.getLastName(),executor);
			try {
				System.out.println(	fname.thenCombine(lname,(a,b)->a+b).get());
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		//	String s =fname.join();
		/*
		 * System.out.println("Demo"); try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
			
			
			System.out.println("Time taken to execute "+(System.currentTimeMillis()-startTime));
				System.out.println("Demo");
	}

}
