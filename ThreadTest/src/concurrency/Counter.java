package concurrency;

public class Counter {
	int i;
	public void increment()
	{
		i++;      //is not atomic(not thread safe,update to i may be lost)
		//get i
		//increment
		//set i
	}
	public int getI() {
		return i;
	}

	
}
