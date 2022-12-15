package at.ac.htlinn.ex02_memory;

public class Playground {
	private Card[][] cards; //(0,0) links oben
	private int whosOnTurn; //0..Spieler 1, 1...Spieler2, ...
	private int[] score; //Die Anzahl der Paerchen pro Spieler
	private int nrPairs;


	/**
	 * @param x Groesse in x-Richtung
	 * @param y Groesse in y-Richtung
	 * @param nrPairs Anzahl der zu erzeugenden Paare
	 * @param nrPlayers wie viele Spieler nehmen Teil
	 */
	public Playground(int x, int y, int nrPairs, int nrPlayers) {
		this.nrPairs = nrPairs;
		score = new int[nrPlayers];
		cards = new Card[x][y];
		init();
	}
	
	public Playground(int x, int y) {
		cards = new Card[x][y];
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
	
	public boolean isPair(int x1, int  y1, int x2, int y2)
	{
		Card c1 = get(x1, y1);
		Card c2 = get(x2, y2);
		
		if (c1 instanceof RegularCard && c2 instanceof RegularCard)
		{
			return c1.equals(c2);
		}
		return false;
	}
	
	/**
	 * 
	 * @return true, wenn alle Paare aufgedeckt wurden
	 */
	public boolean finished()
	{
		int p = 0; //Gesamtzahl der aufgedeckten Paare
		for (int s : this.score)
		{
			p += s;
		}
		return nrPairs == p;
	}
	
	public void nextPlayer()
	{
		whosOnTurn = (whosOnTurn + 1) % score.length;
	}
	
	public int getPlayer()
	{
		return whosOnTurn;
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
	
	public Card get(int x, int y)
	{
		return cards[x][y];
	}
	
	public void set(int x, int y, Card c)
	{
		cards[x][y] = c;
	}
}
