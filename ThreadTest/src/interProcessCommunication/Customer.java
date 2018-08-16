package interProcessCommunication;

public class Customer extends Thread{
	int amount = 10000;
	synchronized void withdraw(int amount) throws InterruptedException
	{
		if(this.amount<amount)
		{
			System.out.println("Less amount,waiting for deposit");
			wait();
		}
		this.amount-=amount;
		System.out.println("withdraw completed");
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit");
		this.amount+=amount;
		System.out.println("Amount deposited");
		notify();
	}
}
