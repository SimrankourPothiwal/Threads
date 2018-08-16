package interProcessCommunication;

public class CustomerTest {
public static void main(String[] args)
{
	Customer customer=new Customer();
	new Thread()
	{
		public void run()
		{
			try {
				customer.withdraw(12000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}.start();
	
	new Thread()
	{
		public void run()
		{
		customer.deposit(50000);
		}
	}.start();
}
}
