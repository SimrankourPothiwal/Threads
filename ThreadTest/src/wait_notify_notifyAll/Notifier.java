package wait_notify_notifyAll;

public class Notifier extends Thread {
	Message message;

	public Notifier(Message message) {
		this.message = message;
	}

	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " Started");
		try {
			Thread.sleep(1000);
		
		synchronized (message) {
			message.setMessage(name + " work done");
			//message.notify();
			message.notifyAll();

		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
