package at.ac.htlinn.threads;

public class SecondThreadRunner {

	public static void main(String[] args) {
		SecondThread st1 = new SecondThread("++++++++++++++++++++++++");
		SecondThread st2 = new SecondThread("************************");
		SecondThread st3 = new SecondThread("-------------------------");
		st1.start();
		st2.start();
		st3.start();
		
		
	}

}
