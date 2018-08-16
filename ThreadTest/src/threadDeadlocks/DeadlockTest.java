package threadDeadlocks;

public class DeadlockTest {
	public static void main(String[] args) {
		final String resource1 = "Hello";
		final String resource2 = "Simran";
		//thread1 tries to lock resource1 then resource2
		Thread thread1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread1 locked resourse1:" + resource1);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (resource2) {
						System.out.println("Thread1 locked resource2:" + resource2);
					}
				}
			}
		};

		//thread1 tries to lock resource2 then resource1
		Thread thread2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread2 locked resourse2:" + resource2);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (resource1) {
						System.out.println("Thread2 locked resource1:" + resource1);
						
					}
				}
			}
		};
		thread1.start();
		thread2.start();

	}

}
