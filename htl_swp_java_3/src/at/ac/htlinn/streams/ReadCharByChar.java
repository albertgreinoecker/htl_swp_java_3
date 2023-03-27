package at.ac.htlinn.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCharByChar {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("testdata/p1.txt"));
		s.useDelimiter("\\Z");  //Trennzeichen ist das letzte Zeichen in der Datei
		String content = s.next(); 
		for (char c : content.toCharArray())
		{
			System.out.println(c);
		}
		s.close();
	}
	

}
