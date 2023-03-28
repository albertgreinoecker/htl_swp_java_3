package at.ac.htlinn.threads;

public class SecondThread extends Thread {
	String msg;
	
	public SecondThread(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.printf("%d: %s\n", i, msg);
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
