package at.ac.htlinn.exceptions;

// Eigene Exception-Klasse
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class OwnExceptionTest {

	// Methode, die unsere eigene Exception werfen kann
	public static String getTicket(int age) throws InvalidAgeException {
		if (age < 14) {
			throw new InvalidAgeException("Alter muss mindestens 14 sein!");
		}
		return "1234DXCD";
	}

	public static void main(String[] args) {
		try {
			String t = getTicket(5); // Versuch mit zu niedrigem Alter
			System.out.println("Zugang erlaubt.");
		} catch (InvalidAgeException e) {
			System.out.println("Fehler: " + e.getMessage());
		}

		System.out.println("Programm läuft weiter...");
	}
}
