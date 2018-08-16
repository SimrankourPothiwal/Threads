package threadStaticSynchronization;

public class Table {
	synchronized static void printTable(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number * i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
