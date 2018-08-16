package threadStaticSynchronization;

class Thread1 extends Thread {
	Table table;
	public Thread1(Table table) {
		this.table = table;
	}
	public void run() {
		table.printTable(10);
	}
}

class Thread2 extends Thread {
	Table table;
	public Thread2(Table table) {
		this.table = table;
	}
	public void run() {
		table.printTable(100);
	}

}

class Thread3 extends Thread {
	Table table;

	public Thread3(Table table) {
		this.table = table;
	}

	public void run() {
		table.printTable(1000);
	}
}

class Thread4 extends Thread {
	Table table;

	public Thread4(Table table) {
		this.table = table;
	}

	public void run() {
		table.printTable(10000);
	}
}

public class StaticSynchronizationTest {
	public static void main(String[] args) {
		//if it is synchronized,no conflicts between threads when we pass same object of class
		//two objects of Table class are passed to different threads it creates interference 
		//between t1 and t3 /t2 and t4(to avoid this we use static synchronization)

		Table table1 = new Table();
		Table table2 = new Table();
		Thread1 thread1 = new Thread1(table1);
		Thread2 thread2 = new Thread2(table1);
		Thread3 thread3 = new Thread3(table2);
		Thread4 thread4 = new Thread4(table2);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
