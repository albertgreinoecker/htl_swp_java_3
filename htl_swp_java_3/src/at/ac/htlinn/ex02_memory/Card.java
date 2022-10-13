package at.ac.htlinn.ex02_memory;

public class Card {
	protected boolean visible;

	@Override
	public String toString() {
		return visible ? "_" : "*";
	}
}
