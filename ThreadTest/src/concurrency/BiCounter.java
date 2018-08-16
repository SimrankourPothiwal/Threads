package concurrency;

public class BiCounter {
	private int i;
	private int j;
	synchronized public void incrementI()
	{
		i++;      //is not atomic(not thread safe,update to i may be lost)
		//get i
		//increment
		//set i
	}
	public int getI() {
		return i;
	}

	synchronized public void incrementJ()
	{
		j++;      //is not atomic(not thread safe,update to j may be lost)
		//get j
		//increment
		//set j
	}
	public int getJ() {
		return i;
	}
	
}
