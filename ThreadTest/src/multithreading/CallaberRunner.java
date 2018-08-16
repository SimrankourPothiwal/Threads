package multithreading;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//to get the results from thread
class CallableTask implements Callable<String> {
	private String name;
	public CallableTask(String name) {
		this.name = name;
	}
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}
}

public class CallaberRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		//submit:to execute callable,when something returns a value
		//Future:not really result but promise that their will be result
		java.util.concurrent.Future<String> future = executorService.submit(new CallableTask("Simran"));//pending result of task
		System.out.println("new CallableTask(\"Simran\") executed");
		String message = future.get(); // waits for task to complete execution
		System.out.println(message);
		System.out.println("Main Completed");
		executorService.shutdown();
	}

}
