import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class ExecutorTest {
  public static void main(String[] args) {
      //It creates an ExecutorService that use a pool of 3 threads

	  ExecutorService executor = Executors.newFixedThreadPool(3);
	  
      for (int i = 0; i < 5; i++) {  
          Runnable worker = new WorkerThread("" + i);  
          executor.execute(worker); 
        }  
      executor.shutdown();  
      while (!executor.isTerminated()) {   }  
 
      System.out.println("All threads are finished.");  
  }
}
 
class WorkerThread implements Runnable {  
    private String message;  
    public WorkerThread(String s){  
        this.message=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
        System.out.println(Thread.currentThread().getName()+" (End)"); 
    }   
}