package at.ac.htlinn.threads;

public class FirstThreadDoesNothing {

	/**
	 * So startet man einen Thread, macht aber keinen Sinn weil nicht festgelegt wurde was er machen soll und stoppt
	 * deshalb gleich wieder
	 */
	public static void main(String[] args) {
		System.out.println("Start");
		Thread thread = new Thread();
		thread.start();
		System.out.println("End");
	}

}
