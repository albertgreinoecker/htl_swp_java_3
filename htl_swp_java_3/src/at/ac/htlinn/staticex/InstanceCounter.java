package at.ac.htlinn.staticex;

public class InstanceCounter {

	private static int cnt;
	
	public InstanceCounter() {
		cnt++;
	}
	
	@Override
	public String toString() {
		return cnt + "";
	}
	public static void main(String[] args) {
		InstanceCounter i1 = new InstanceCounter();
		System.out.println(i1);

		InstanceCounter i2 = new InstanceCounter();
		System.out.println(i2);
		
		InstanceCounter i3 = new InstanceCounter();
		System.out.println(i3);
		
		System.out.println(i1);
		
		System.out.println(InstanceCounter.cnt);
		
		double x = Math.random();
		String s = "asdf";
		String l = s.toLowerCase();
	}

}
