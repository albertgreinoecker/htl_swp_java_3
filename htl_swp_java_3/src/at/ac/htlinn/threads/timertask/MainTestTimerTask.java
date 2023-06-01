package at.ac.htlinn.threads.timertask;

import java.util.Timer;

public class MainTestTimerTask {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new TestTimerTask("Timer 1"), 0, 3000);
		timer.schedule(new TestTimerTask("Timer 2"), 0, 5000);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("DANACH!!!");
	}

}
