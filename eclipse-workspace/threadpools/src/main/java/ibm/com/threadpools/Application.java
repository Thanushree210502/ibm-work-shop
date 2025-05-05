package ibm.com.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application
{
	public static void main( String[] args )
	{
//     int vCPUs = Runtime.getRuntime().availableProcessors();
//      System.out.println(vCPUs);
		ExecutorService service = Executors.newCachedThreadPool();
		for(int counter =0;counter<10;counter++) {
			service.execute(new Task(counter));
			try {
				Thread.sleep(10);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	static class Task implements Runnable{
		int count;
		Task(int count) {
			 this.count=count;
		}
		@Override
		public void run() {
			 System.out.println(Thread.currentThread()+"--> "+count);
			
		}
		
		
	}
}