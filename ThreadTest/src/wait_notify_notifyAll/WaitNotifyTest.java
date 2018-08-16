package wait_notify_notifyAll;

public class WaitNotifyTest {
public static void main(String[] args)
{
	Message message=new Message("Process it");
	Waiter waiter1=new Waiter(message);
	waiter1.setName("Waiter1");
	waiter1.start();
	
	Waiter waiter2=new Waiter(message);
	waiter2.setName("Waiter2");
	waiter2.start();
	
	Notifier notifier=new Notifier(message);
	notifier.setName("Notifier");
	notifier.start();
	
	System.out.println("All the threads are started");
	
}
}
