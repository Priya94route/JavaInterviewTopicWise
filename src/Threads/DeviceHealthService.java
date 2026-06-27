package Threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeviceHealthService {

    // Custom thread pool — iska reason baad mein explain karta hun
    private final ExecutorService executor = 
        Executors.newFixedThreadPool(10);

    public CompletableFuture<String> fetchPingData(String deviceId) {
        
        // supplyAsync = kuch return karna hai
        // runAsync   = sirf kaam karna hai, return nahi
        
        return CompletableFuture.supplyAsync(() -> {
            // yeh lambda ForkJoinPool mein chalega (ya custom executor mein)
            System.out.println("Fetching ping - Thread: " 
                + Thread.currentThread().getName());
            
            // simulate network call
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // checked exception — yahan problem hai!
            return "Ping OK: 45ms";
            
        }, executor); // custom executor pass karo — WHY? neeche explain
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}


	


