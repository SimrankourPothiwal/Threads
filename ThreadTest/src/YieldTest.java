
public class YieldTest {

	public static void main(String[] args) throws InterruptedException {
		// Task1
		Task1 task1 = new Task1();
		task1.start(); // to invoke task1 run() as new thread instance
		
		//Task2
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.start();
		
		// Task3
		System.out.println("task3 started");
		for (int i = 31; i < 39; i++)
			System.out.print(i+" ");
		System.out.println("Task3 done");
		System.out.println("Main done");

	}

}
