package at.ac.htlinn.streams;

public class StringWriterDemo {

	static String writeNumbers(int n)
	{
		String s = "";
		for (int i = 0; i < n; i++)
		{
			s += i + "_";
		}
		return s;
	}
	
	static String writeNumbersWithStringBuilder(int n)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++)
		{
			sb.append(i);
			sb.append("_");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String s = writeNumbers(10000);
		System.out.println(s);
		String s2 = writeNumbersWithStringBuilder(10000);
		System.out.println(s2);

	}

}
