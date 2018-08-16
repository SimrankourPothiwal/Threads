
public class Task1 extends Thread {
	public void run() {
		System.out.println("Task1 started");
		for (int i = 11; i < 19; i++)
			System.out.print( i + " ");
		Thread.yield();  //Task1 is telling schedular,ok I had enough time & Im ready to give up(just a request)
		System.out.println("Task1 done");

	}

	
}
