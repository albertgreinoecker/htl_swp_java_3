package at.ac.htlinn.ex02_memory;

public abstract class Card {
	protected boolean visible;

	@Override
	public String toString() {
		return visible ? "_" : "*";
	}
	
	public abstract void ausgabe();
}
