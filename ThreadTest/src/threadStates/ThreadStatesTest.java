package threadStates;

/*1)NEW:Ready to run but nobody told it to start yet
  2)RUNNABLE:Ready to run but other thread is being executed(waiting for its chance to be executed)
  3)RUNNING:Currently executing (thread in execution)
  4)BLOCKED/WAITING:Waiting for external service to respond/when one thread depend upon output of other thread
  5)TERMINATED/DEAD:Completed Execution
*/



public class ThreadStatesTest extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		try {
				System.out.println(Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
	
	public static void main(String[] args)
	{
		ThreadStatesTest thread1=new ThreadStatesTest();
		thread1.start();
		thread1.setName("Thread1");
		thread1.setPriority(MIN_PRIORITY);
		
		ThreadStatesTest thread2=new ThreadStatesTest();
		thread2.start();
		//Thread.yield();
		thread2.setName("Thread2");
		thread1.setPriority(MAX_PRIORITY);

		

		
	}
	

}
