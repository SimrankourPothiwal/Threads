package concurrency;

public class ConcurrencyRunner {
	public static void main(String[] args) {
		Counter count = new Counter();

		count.increment();
		count.increment();
		count.increment();
		count.increment();
		System.out.println(count.getI());

	}
}
