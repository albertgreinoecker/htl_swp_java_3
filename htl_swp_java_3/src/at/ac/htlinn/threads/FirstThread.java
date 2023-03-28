package at.ac.htlinn.threads;

public class FirstThread extends Thread {
	@Override
	public void run() {
		while (true) //Bei Threads wird auch gerne mal eine Endlosschleife verwendet
		{
			System.out.println("FirstThread ist am Laufen");
		}
	}
}
