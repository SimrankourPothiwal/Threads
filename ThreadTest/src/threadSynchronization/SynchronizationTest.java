package threadSynchronization;

public class SynchronizationTest {
	public static void main(String[] args)
	{
		Table table=new Table();
		Table table1=new Table();
		Thread1 thread1=new Thread1(table);
		Thread2 thread2=new Thread2(table);
		Thread2 thread3=new Thread2(table1);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
