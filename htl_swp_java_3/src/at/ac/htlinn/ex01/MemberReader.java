package at.ac.htlinn.ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MemeberReader {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("player.csv"));
		s.nextLine();
		while (s.hasNextLine())
		{
			String str = s.nextLine();
			String parts[] = str.split(";");
			String fullName = parts[0];
			int age = Integer.parseInt(parts[1]);
			String photoUrl = parts[2];
			String nationality = parts[3];
			String position = parts[4];
			Player p = new Player( fullName, age, photoUrl, position, nationality);
			System.out.println(p);
		}
		
		s.close();

	}

}
