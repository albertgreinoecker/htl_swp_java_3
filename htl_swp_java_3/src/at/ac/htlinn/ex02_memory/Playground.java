package at.ac.htlinn.ex02_memory;

public class Playground {
	private Card[][] cards; //(0,0) links oben
	private int whosOnTurn; //0..Spieler 1, 1...Spieler2, ...
	private int[] score; //Die Anzahl der Paerchen pro Spieler
	private int nrJoker;
	private int nrPairs;


	/**
	 * @param x Groesse in x-Richtung
	 * @param y Groesse in y-Richtung
	 * @param nrJoker Anzahl der Jokerkarten
	 * @param nrPairs Anzahl der zu erzeugenden Paare
	 * @param nrPlayers wie viele Spieler nehmen Teil
	 */
	public Playground(int x, int y,  int nrJoker, int nrPairs, int nrPlayers) {
		this.nrJoker = nrJoker;
		this.nrPairs = nrPairs;
		score = new int[nrPlayers];
		cards = new Card[x][y];
		init();
	}
	
	/**
	 * Erzeuge zufaellig ein mit Karten besetztes Spielfeld
	 */
	public void init()
	{
		//Alle Felder zuerst auf EmptyCard setzen
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards[i].length; j++) {
				cards[i][j] = new EmptyCard();
			}
		}
		
		for (int i = 0; i < nrPairs; i++) {
			placeRegularCard(i);
			placeRegularCard(i);
		}
		
	}
	
	private void placeRegularCard(int c)
	{
		int x = 0;
		int y = 0;
		do //solange kein freier Platz gefunden, ziehe neue x und y
		{
			x = (int)(Math.random()*cards.length);
			y = (int)(Math.random()*cards[0].length);
		} while (!(cards[x][y] instanceof EmptyCard));
		cards[x][y] = new RegularCard(c);
	}
	
	/**
	 * @return Die Karte die aufgedeckt wurde
	 */
	public Card play(int x, int y)
	{
		return cards[x][y];
		
	}
	
	/**
	 * 
	 * @return true, wenn alle Paare aufgedeckt wurden
	 */
	public boolean finished()
	{
		return false;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards[i].length; j++) {
				s += String.format("%s|" , cards[i][j]);
			}
			s += "\n";
		}
		return s;
	}
	
	public void ausgabe()
	{
		System.out.printf("%3s", "");
		for (int i = 0; i < cards[0].length; i++) {
			System.out.printf("%2d", i);
		}
		System.out.println();
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%d : ", i);
			for (int j = 0; j < cards[i].length; j++) 
			{
				Card c = cards[i][j];
				if (c.visible)
				{
					c.ausgabe();
				} else
				{
					System.out.print("*");
				}
				System.out.print("|");
			}
			
			System.out.println();
		}
	}
}
