package multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//Execution of threads in basic way is not vry easy so we use ExecutorService
//ExecutorService:provides option for no. of threads to be executed for processing the task
public class ExecutorServiceRunner {
public static void main(String[] args)
{
	ExecutorService executorService=Executors.newSingleThreadScheduledExecutor();
	executorService.execute(new Task(1));
	executorService.execute(new Thread(new Task(2)));
	
	// Task3
	System.out.println("task3 started");
	for (int i = 31; i < 39; i++)
		System.out.println(i);

	System.out.println("Task3 done");
	System.out.println("Main done");
	executorService.shutdown();

}
}
