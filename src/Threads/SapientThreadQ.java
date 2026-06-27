package Threads;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class SapientThreadQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li=new LinkedList(List.of(1,2,3,4,6,7,8));
		ExecutorService ex=Executors.newFixedThreadPool(3);
		for(int i=0;i<li.size();++i)
		{
			int index=i;
			ex.submit(()->li.set(index,li.get(index)+1));
			
		}
		
		
		try {
			ex.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(li);
		
		
		/*
		 * //How to use ExecutorService with CompletableFuture. Gave a scenario to place
		 * an Order with steps as:- a. initiate payment b. update inventory c. send
		 * email to user. Implement the above using Completable Future
		 */
		
		
	}

}
