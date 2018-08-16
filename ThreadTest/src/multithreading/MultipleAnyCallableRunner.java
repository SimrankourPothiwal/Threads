package multithreading;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		//list of task to be executed
		List<CallableTask> tasks = List.of(new CallableTask("Simran"),
										   new CallableTask("Sanjana"),
										   new CallableTask("Preet"));
		//invokeAny:we can pass multiple task as soon as one task complete execution 
		//it returns the result(wait for only fastest task)		
		String task = executorService.invokeAny(tasks);
		//print the completed task
		System.out.println(task);
		//no new task will be accepted
		executorService.shutdown();
}
}
