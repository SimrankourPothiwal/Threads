
public class Reentrant extends Thread{
	synchronized private void apple()
	{
		orange();
		System.out.println("Hi from apple");
	}

	synchronized private void orange() {
		System.out.println("Hi from orange");		
	}
	
	public static void main(String[] args)
	{
		Reentrant monitor=new Reentrant();
		
		new Thread() {
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
				monitor.apple();
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				monitor.apple();
			}
		}.start();
		
		System.out.println("Main done");
	}

}
