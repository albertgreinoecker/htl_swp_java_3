package at.ac.htlinn.threads.counter;

class ZaehlerThread extends Thread {
	private String name;
	private long millis;

	public ZaehlerThread(String name, long millis) {
		this.name = name;
		this.millis = millis;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(name + ": " + i);
			try {
				Thread.sleep(millis); // 0,5 Sekunden Pause
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		ZaehlerThread t1 = new ZaehlerThread("Thread A", 100);
		ZaehlerThread t2 = new ZaehlerThread("Thread B", 300);

		t1.start(); // startet Thread A
		t2.start(); // startet Thread B
	}
}
