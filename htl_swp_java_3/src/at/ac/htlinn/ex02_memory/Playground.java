package at.ac.htlinn.ex02_memory;

public class Playground {
	private Card[][] cards; //(0,0) links oben
	private int whosOnTurn; //0..Spieler 1, 1...Spieler2, ...
	private int[] score; //Die Anzahl der Paerchen pro Spieler
	private int nrJoker;
	private int nrPairs;
	
	public Playground(int whosOnTurn, int nrJoker, int nrPairs) {
		this.whosOnTurn = whosOnTurn;
		this.nrJoker = nrJoker;
		this.nrPairs = nrPairs;
	}
	
	public void init()
	{
		
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
}
