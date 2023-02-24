package at.ac.htlinn.streams;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class NumberFilterWriter extends FilterWriter {

	protected NumberFilterWriter(Writer out) {
		super(out);
	}
	
	@Override
	public Writer append(char c) throws IOException {
		if (Character.isDigit(c)) // Zeichen zwischen 0..9
		{
			return super.append("EINE ZAHL");
		}
		return super.append(c);
	}
	
	public static void main(String[] args) throws IOException {
		NumberFilterWriter fr = new NumberFilterWriter(new FileWriter("numberfilter.txt"));
		fr.append('A');
		fr.append('1');
		fr.close();
	}

}
