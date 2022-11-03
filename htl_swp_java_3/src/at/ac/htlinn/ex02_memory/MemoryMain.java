package at.ac.htlinn.ex02_memory;

import java.util.Scanner;

public class MemoryMain {

	static Scanner s = new Scanner(System.in);
	static int last_x, last_y = -1;

	static Card openCard(Playground p) {
		System.out.println("x y:");
		String l = s.nextLine();
		String[] ls = l.split(" ");
		int x = Integer.parseInt(ls[0]);
		int y = Integer.parseInt(ls[1]);
		if (x == last_x && y == last_y) {
			return null;
		}
		last_x = x;
		last_y = y;
		return p.play(x, y);
	}

	public static void main(String[] args) {
		Playground p = new Playground(5, 5, 0, 10, 2);
		System.out.println(p);
		System.out.println();
		

		while (!p.finished()) {
			p.ausgabe();
			last_x = last_y = -1;
			System.out.printf("Spieler %d ist am Zug", p.getPlayer());
			Card c1 = openCard(p);
			c1.ausgabe();
			System.out.println();
			if (c1 instanceof RegularCard) {
				Card c2 = openCard(p);
				if (c2 == null) {
					System.out.println("Ungültige Eingabe!");
					p.nextPlayer();
					continue;
				}
				c2.ausgabe();
				System.out.println();
				if (c2 instanceof EmptyCard)
				{
					System.out.println("Leider eine Empty Card erwischt!");
				}
				else if (c1.equals(c2)) {
					c1.setVisible(true);
					c2.setVisible(true);
				} 
				
				else {
					System.out.println("Leider kein Pärchen erwischt!");
					p.nextPlayer();
				}

			} else {
				System.out.println("Leider eine Empty Card erwischt!");
				p.nextPlayer();
			}
		}
		s.close();
	}
}
