package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i;
	private int j;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	// breaking synchronized code into smaller chuncks
	synchronized public void incrementI() {
		// get lock for i
		lockForI.lock(); // check no other thread has lock on i
		i++;
		lockForI.unlock(); //

		// release lock for i
	}

	public int getI() {
		return i;
	}

	synchronized public void incrementJ() {
		lockForJ.lock(); // get lock for j

		j++;
		lockForJ.lock(); // release lock for j

	}

	public int getJ() {
		return i;
	}

}
