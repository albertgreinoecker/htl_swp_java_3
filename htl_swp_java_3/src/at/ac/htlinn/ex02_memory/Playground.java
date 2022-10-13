package at.ac.htlinn.ex02_memory;

import java.util.Iterator;

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
	public Card play()
	{
		return null;
		
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
}
