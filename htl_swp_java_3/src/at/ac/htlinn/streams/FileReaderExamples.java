package at.ac.htlinn.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderExamples {

	static void readCharByChar() throws IOException {
		FileReader reader = new FileReader("testdata/p1.txt");
		int i = 0;
		while ((i = reader.read()) != -1) //lese solange bis Ende der Datei
		{
			System.out.println((char)i); //Uebertrage int in char
		}
		reader.close();
	}
	
	static void readWithBuffer() throws IOException {
		FileReader reader = new FileReader("testdata/p1.txt");
		char[] buffer = new char[100];
		int len = 0;
		while ((len = reader.read(buffer)) != -1)
		{
			System.out.println("Buffer length: " + buffer.length);
			System.out.println("Buffer: " + Arrays.toString(buffer));
			System.out.println("Read length: " + len);
			String s = new String(buffer, 0, len);
			System.out.println(len + ":" + s);
		}
		reader.close();
	}
	
	static void readWithBufferedReader() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("testdata/p1.txt"));
		String line = null;
		while ((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
	
		//readCharByChar();
		//readWithBuffer();
		readWithBufferedReader();
	}

}
