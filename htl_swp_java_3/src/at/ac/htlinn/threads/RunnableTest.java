package at.ac.htlinn.threads;

public class RunnableTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		t1.start();

		Runnable runnable = () -> {
			while (true)
				System.out.println("Also works with lambda");
		};
		Thread t2 = new Thread(runnable);
		t2.start();

		
		
		Thread t3 = new Thread(() -> {
			while (true)
				System.out.println("Even shorter Syntax");
		});
		t3.start();
		
	}

}
