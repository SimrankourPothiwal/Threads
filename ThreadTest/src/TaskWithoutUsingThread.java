
public class TaskWithoutUsingThread {
	public static void main(String[] args) {
		// Task1
		for (int i = 101; i < 199; i++) {
			System.out.println(i + " ");
		}
		System.out.println("Task1 done");

		// Task2
		for (int i = 201; i < 299; i++) {
			System.out.println(i);
		}
		System.out.println("Task2 done");

		// Task3
		for (int i = 301; i < 399; i++) {
			System.out.println(i);
		}
		System.out.println("Task3 done");

	}

}
