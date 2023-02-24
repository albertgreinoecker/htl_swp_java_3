package at.ac.htlinn.streams;

import java.io.IOException;
import java.io.StringWriter;

public class WriteString {

	public static void main(String[] args) throws IOException {
		String s = "Hallo ";
		s += "HTL";
		for (int i = 0; i < 1000;i++)
		{
			s += " " + i;
		}
		System.out.println(s);

		StringWriter sw = new StringWriter();
		sw.append("Hallo HTL");
		for (int i = 0; i < 1000;i++)
		{
			sw.append(" " + i);
		}
		sw.close();
		System.out.println(sw.toString());
	}
	 
}
