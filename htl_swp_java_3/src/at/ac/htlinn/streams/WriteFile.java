package at.ac.htlinn.streams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("/home/albert/tmp/test.txt");
		for (int i = 0; i < 1000;i++)
		{
			double d = Math.random();
			fw.append(d + "\n");
		}
		fw.flush();
		fw.close();
	}

}
