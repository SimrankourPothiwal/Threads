package multithreading;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		//list of task to be executed
		List<CallableTask> tasks = List.of(new CallableTask("Simran"),
										   new CallableTask("Sanjana"),
										   new CallableTask("Preet"));
		//invokeAll:wait for all task to complete execution and put them in list
		List<Future<String>> taskList = executorService.invokeAll(tasks);
		//print the taskList
		for(Future<String> list:taskList)
		{
			System.out.println(list.get());
		}
		//no new task will be accepted
		executorService.shutdown();
}
}
