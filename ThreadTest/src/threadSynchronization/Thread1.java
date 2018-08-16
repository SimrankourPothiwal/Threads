package threadSynchronization;

public class Thread1 extends Thread{
	Table table;
	Thread1(Table table1)
	{
		this.table=table1;
	}
	
public void run()
{
	table.printTable(5);
}
}
		