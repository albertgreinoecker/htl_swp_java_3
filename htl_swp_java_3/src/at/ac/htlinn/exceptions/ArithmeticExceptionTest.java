package at.ac.htlinn.exceptions;

public class ArithmeticExceptionTest {

	
	public static void divByZero() {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		try {  // Hier wird die Exception abgefangen
			divByZero();
		} catch (ArithmeticException ex) {
			System.out.println("Division by zero is not allowed!");
		}
		
		// Hier wird die Exception nicht abgefangen und das Programm crasht
		
		divByZero();
		System.out.println("Ende");
	}

}
