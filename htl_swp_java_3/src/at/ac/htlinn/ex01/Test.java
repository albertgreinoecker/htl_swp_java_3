package at.ac.htlinn.ex01;

public class Test {

	public static void main(String[] args) {
		Member m1 = new Member("Lionel Messi", 35, "http://xyz.com");
		Member m2 = new Member("Lionel Messi", 35, "http://xyz.com");

		System.out.println(m1);
		System.out.println(m2);
		
		Trainer t1 = new Trainer("Philipp Sagmeister", 16, "http://xyz.com", "Chief Trainer");
		System.out.println(t1);
	
		Trainer t2 = new Trainer("Lionel Messi", 35, "http://xyz.com", "Trainer");
		Trainer t3 = new Trainer("Lionel Messi", 35, "http://xyz.com", "Trainer");
		if (t3.equals(t2))
		{
			System.out.println("gleich!");
		}
		System.out.println(t3);
		
	}

}
