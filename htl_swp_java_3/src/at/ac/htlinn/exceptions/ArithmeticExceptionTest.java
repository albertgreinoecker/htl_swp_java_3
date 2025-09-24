package at.ac.htlinn.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArithmeticExceptionTest {

	
	
	public static void readFromFile() throws FileNotFoundException {
			Scanner s = new Scanner(new File("test.txt"));
		 	while(s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
	}	
	
	public static void divByZero() {
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		try {  // Hier wird die Exception abgefangen
			String s = null;
			s = s.toUpperCase();
			//divByZero();
			readFromFile();
			System.out.println("Nach der Division");
		} catch (Exception ex) {
			System.out.println("Fehler: " + ex.getMessage());
			ex.printStackTrace();

		}
		System.out.println("Weiter im Programm");
		// Hier wird die Exception nicht abgefangen und das Programm crasht
		try
		{
			divByZero();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Fehler: " + ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("Ende");
	}

}
