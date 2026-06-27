package Threads;

public class ProducerConsumer {
	
	
	int bucket[];
	int size=10;
	int count=0;
	int in=0;
	int out=0;
	
	
	ProducerConsumer()
	{
		this.bucket=new int[size];
	}
	
	
	synchronized  int producer(int i)
	{
		while(count==size)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		bucket[in]=i;
		in=(in%10)+1;
		count++;
		
		return i;
	}
	
	synchronized  void consumer()
	{
		while(count==0)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		int i=bucket[out];
		out=(out%10)+1;
		count--;
		
		//return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProducerConsumer ob=new ProducerConsumer();
		Thread t= new Thread(()->{
			while(true)
			{
			ob.producer(10);
			}});
		
		
		
		Thread t1=new Thread(()->{
		    while(true)
		    {
			ob.consumer();
		    }	
		});

		   t1.start();
		   t.start();

		

	}

}
