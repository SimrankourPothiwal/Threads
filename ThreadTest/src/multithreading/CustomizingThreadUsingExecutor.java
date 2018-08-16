package multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomizingThreadUsingExecutor {
	public static void main(String[] args)
	{
		ExecutorService executorService=Executors.newFixedThreadPool(2); //Two active task at a time(specific no of active threads)
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));

		executorService.shutdown(); //no new task will be accepted

	}

}
