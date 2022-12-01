package at.ac.htlinn.junit;

public class Money {
	private String currency;
	private double amount;
	
	public Money(String currency, double amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public Money add(Money m)
	{
		if (!currency.equals(m.currency))
		{
			return null;
		}
		return new Money(currency, amount + m.amount);
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f (%s)", amount, currency);
	}
	@Override
	public boolean equals(Object obj) {
		Money m = (Money)obj;
		return currency.equals(m.currency) 
				&& amount == m.amount;
	}
	
	
	public static void main(String[] args) {
		Money m1 = new Money("EUR", 10);
		Money m2 = new Money("EUR", 20);
		
		Money m3 = m1.add(m2);
		if (m3.amount == 30)
		{
			System.out.println("OK");
		} else
		{
			System.out.println("NICHT OK");
		}
	}
	
}
