package at.ac.htlinn.streams;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadWebSiteText {

	public static void readCharByChar(String url) throws MalformedURLException, IOException {
		InputStream inStream = new URL(url).openStream();
		int c;
		while ((c = inStream.read()) != -1) {
			char ch = (char) c;
			System.out.print(ch);
		}
	}

	public static void readWithBuffer(String url) throws MalformedURLException, IOException {
		InputStream inStream = new URL(url).openStream();
		byte[] buffer = new byte[1000];
		int len = 0;
		while ((len = inStream.read(buffer)) != -1) {
			String s = new String(buffer);
			System.out.println(len + ":" + s);
		}
	}

	public static void readWithBufferAll(String url) throws MalformedURLException, IOException {
		InputStream inStream = new URL(url).openStream();
		byte[] buffer = inStream.readAllBytes();

		String s = new String(buffer);
		System.out.println(s);
	}

	public static void main(String[] args) throws MalformedURLException, IOException {
		String url = "https://filesamples.com/samples/document/txt/sample3.txt";
		// readCharByChar(url);
		//readWithBuffer(url);
		readWithBufferAll(url);
	}

}
