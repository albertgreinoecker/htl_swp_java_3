package at.ac.htlinn.ex01;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Member> members;
	
	public Team(String name) {
		this.name = name;
	}
	
	public void add(Member m)
	{
		members.add(m);
	}
	
	@Override
	public String toString() {
		String s = this.name  + "\n" ;
		for (Member member : members) {
			if (member instanceof Player)
			{
				System.out.println("Ist ein Player");
			}
				System.out.println("Spieler");
			s += "\t" + member + "\n";
		}
		return s;
	}
}
