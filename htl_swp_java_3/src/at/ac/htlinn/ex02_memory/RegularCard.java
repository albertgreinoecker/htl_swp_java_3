package at.ac.htlinn.ex02_memory;

public class RegularCard extends Card {
	private int value;

	public RegularCard(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return value + super.toString();
	}
	
	public void ausgabe()
	{
		System.out.print(value);
	}
}
