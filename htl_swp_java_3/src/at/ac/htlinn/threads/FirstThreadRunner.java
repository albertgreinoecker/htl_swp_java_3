package at.ac.htlinn.threads;

public class FirstThreadRunner {

	public static void main(String[] args) {
		  FirstThread thread = new FirstThread();
		  thread.start();
		  while (true)
		  {
			  System.out.println("#################ich laufe danach");
		  }

	}

}
