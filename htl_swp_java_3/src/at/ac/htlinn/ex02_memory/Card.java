package at.ac.htlinn.ex02_memory;

public abstract class Card {
	protected boolean visible;

	
	
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	@Override
	public String toString() {
		return visible ? "_" : "*";
	}
	
	public abstract void ausgabe();
}
