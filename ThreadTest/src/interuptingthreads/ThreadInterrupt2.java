package interuptingthreads;

public class ThreadInterrupt2 extends Thread{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(Thread.interrupted())
				System.out.println("Thread is interrupted");
			else
				System.out.println("normal thread execution");
		}
	}
	
	public static void main(String[] args)
	{
		ThreadInterrupt2 thread=new ThreadInterrupt2();
		thread.start();
		thread.interrupt();
	}
}
