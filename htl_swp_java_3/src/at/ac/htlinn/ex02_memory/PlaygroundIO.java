package at.ac.htlinn.ex02_memory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlaygroundIO {

	/**
	 * 
	 * @param str e.g. 2* for RegularCards and E* for EmptyCards
	 * @return
	 */
	private static Card readCard(String str) {
		boolean visible = str.charAt(1) != '*';
		if (str.startsWith("E")) {
			return new EmptyCard(visible);
		}
		
		int value = Integer.parseInt(str.charAt(0) + "");
		return new RegularCard(visible, value);

	}

	public static Playground read(String fName, int sizeX, int sizeY) throws FileNotFoundException {

		Playground p = new Playground(sizeX, sizeY);
		Scanner s = new Scanner(new File(fName));
		int x = 0;
		while (s.hasNextLine()) {
			String l = s.nextLine();
			String[] parts = l.split("\\|");
			int y = 0;
			for (String part : parts)
			{
				Card c = readCard(part);
				p.set(x, y, c);
				y++;
			}
			x++;
		}
		s.close();
		return p;
	}
}
