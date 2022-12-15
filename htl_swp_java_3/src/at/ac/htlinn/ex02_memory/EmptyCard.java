package at.ac.htlinn.ex02_memory;

public class EmptyCard extends Card {
	
	public EmptyCard(boolean visible)
	{
		super(visible);
	}
	public EmptyCard() {
	}
	@Override
	public String toString() {
		
		return "E" + super.toString();
	}
	
	public void ausgabe()
	{
		System.out.print("E");
	}
}
