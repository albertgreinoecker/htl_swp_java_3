package at.ac.htlinn.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionTest {
	public static void liesDatei(String dateiname) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(dateiname));
		String zeile;
		while ((zeile = reader.readLine()) != null) {
			System.out.println(zeile);
		}
		reader.close();
	}

	public static void main(String[] args) {
		try {
			liesDatei("test.txt");
		} catch (IOException e) {
			System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
		}

		System.out.println("Programm läuft weiter...");
	}
}
