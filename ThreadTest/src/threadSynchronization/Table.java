package threadSynchronization;

public class Table {
	 synchronized public void printTable(int number) {
		//synchronized(this) {        //synchronized block
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

