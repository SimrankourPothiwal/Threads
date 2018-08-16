package threadSynchronization;

public class SynchronizationUsingAnonymousClass {
	public static void amin(String[] args)
	{
		final Table table=new Table();
		Thread thread1=new Thread(){
			public void run()
			{
				table.printTable(6);
			}
		};

		Thread thread2=new Thread() {
			public void run()
			{
				table.printTable(7);
			}
		};

		thread1.start();
		thread2.start();
	}


}
