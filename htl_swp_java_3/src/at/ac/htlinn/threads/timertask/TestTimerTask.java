package at.ac.htlinn.threads.timertask;

import java.util.TimerTask;

public class TestTimerTask extends TimerTask {
	private String name;
	
	public TestTimerTask(String name)
	{
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.printf("%s - Wurde aufgerufen\n", name);
	}

}
