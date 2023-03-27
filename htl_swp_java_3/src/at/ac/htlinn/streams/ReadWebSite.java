package at.ac.htlinn.streams;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * Unter Verwendung von https://jsoup.org/
 * @author albert
 *
 */
public class ReadWebSite {

	public static void main(String[] args) throws MalformedURLException, IOException {
		String url = "https://htlinn.ac.at/schule/gemeinschaft/lehrpersonen";
		InputStream inStream = new URL(url).openStream();
		Document doc = Jsoup.parse(inStream, "UTF-8", url);
		Elements names = doc.getElementsByClass("name");
		System.out.println(names.size());
		for (Element name : names)
		{

			String nameStr = name.toString();
			System.out.println(nameStr);
			String onlyName = name.getElementsByTag("span").text();
			System.out.println(onlyName);
		}
	}

}
