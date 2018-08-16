package multithreading;

public class Task extends Thread {
	private int number;
	public Task(int number) {
		this.number = number;
	}
	@Override
	public void run() {
		System.out.println("Task" + number + " Started");
		for (int i = number * 10; i <= number * 10 + 9; i++)
			System.out.println(i + " ");
		System.out.println("Task" + number + " Done");
	}
}
