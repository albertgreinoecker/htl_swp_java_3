package at.ac.htlinn.ex01;

public class Player extends Member {
	private String position;
	private String nationality;

	public Player(String fullName, int age, String photoUrl, String position, String nationality) {
		super(fullName, age, photoUrl);
		this.position = position;
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Player [position=" + position + ", nationality=" + nationality + ", toString()=" + super.toString()
				+ "]";
	}

}
