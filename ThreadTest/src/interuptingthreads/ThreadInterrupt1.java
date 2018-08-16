package interuptingthreads;

public class ThreadInterrupt1 extends Thread{
	public void run()
	{
		System.out.println("Task done");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		throw new RuntimeException("Thread interupted"+e);
		}
		}

	public static void main(String[] args)
	{
		ThreadInterrupt1 thread1=new ThreadInterrupt1();
		thread1.start();
		try
		{
		thread1.interrupt();
		}catch(Exception e)
		{
			System.out.println("Exception handled"+e);
		}
	}
}
