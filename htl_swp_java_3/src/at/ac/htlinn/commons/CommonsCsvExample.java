package at.ac.htlinn.commons;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class CommonsCsvExample {
	 public static void main(String[] args) {
	        String fileName = "beispiel.csv";

	        // --- Schreiben ---
	        try (Writer out = new FileWriter(fileName);
	             CSVPrinter printer = new CSVPrinter(out, 
	                     CSVFormat.DEFAULT.withHeader("ID", "Name", "Alter"))) {

	            printer.printRecord(1, "Anna", 23);
	            printer.printRecord(2, "Bernd", 31);
	            printer.printRecord(3, "Clara", 29);

	            System.out.println("CSV-Datei geschrieben: " + fileName);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // --- Lesen ---
	        try (Reader in = new FileReader(fileName)) {
	            Iterable<CSVRecord> records = CSVFormat.DEFAULT
	                    .withFirstRecordAsHeader()
	                    .parse(in);

	            for (CSVRecord record : records) {
	                String id = record.get("ID");
	                String name = record.get("Name");
	                String alter = record.get("Alter");

	                System.out.printf("ID=%s, Name=%s, Alter=%s%n", id, name, alter);
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
