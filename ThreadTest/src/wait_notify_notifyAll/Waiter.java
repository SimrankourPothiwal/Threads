package wait_notify_notifyAll;

public class Waiter extends Thread {
	Message message;
	public Waiter(Message message) {
		this.message = message;
	}

	public void run() {
		synchronized (message) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " Waiting to get notified at time" + System.currentTimeMillis());
			try {
				message.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " thread notified at time" + System.currentTimeMillis());
			// process the message now
			System.out.println(name + " processed:" + message.getMessage());
		}
	}
}
