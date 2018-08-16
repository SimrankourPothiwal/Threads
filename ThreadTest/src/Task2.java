
public class Task2 implements Runnable {
	public void run() {
		System.out.println("Task2 started");
		for (int i = 21; i < 29; i++)
			System.out.print(i + " ");
		System.out.println("Task2 done");
	}
}
