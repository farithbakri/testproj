import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestThreadThread implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is currently running on the main thread," + "the id is: " +Thread.currentThread().getId());
		TestThreadThread worker = new TestThreadThread();
		Thread thread = new Thread(worker);
		thread.start();
		Thread t2 = new Thread(worker);
		t2.start();
		Thread t3 = new Thread(worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.start();
		
		LocalDateTime ldt;
		ldt = LocalDateTime.now();
		System.out.println("Main finished running...");
	}
	@Override
	public void run() 
	{
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + "This is currently running on a seperate thread, " + "the id is:" + Thread.currentThread().getId()+ ", with Name :" + Thread.currentThread().getName()+ ", with Priority");
		
		
		
		
	
	}

}
