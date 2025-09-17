package at.ac.htlinn.exceptions;

// Eigene Exception-Klasse
class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class OwnExceptionTest {

	// Methode, die unsere eigene Exception werfen kann
	public static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Alter muss mindestens 18 sein!");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(15); // Versuch mit zu niedrigem Alter
			System.out.println("Zugang erlaubt.");
		} catch (InvalidAgeException e) {
			System.out.println("Fehler: " + e.getMessage());
		}

		System.out.println("Programm läuft weiter...");
	}
}
