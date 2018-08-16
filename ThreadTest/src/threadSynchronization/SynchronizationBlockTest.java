package threadSynchronization;

class Table1 extends Thread {
	void printTable(int number) {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(number * i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class SynchronizationBlockTest {
	public static void main(String[] args) {
		Table1 table = new Table1();
		Thread thread1 = new Thread() {
			public void run() {
				table.printTable(6);
				;
			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				table.printTable(7);
			}
		};
		thread1.start();
		thread2.start();
	}

}
