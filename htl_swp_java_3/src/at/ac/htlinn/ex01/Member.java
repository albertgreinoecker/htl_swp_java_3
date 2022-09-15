package at.ac.htlinn.ex01;

public class Member {
	private String fullName;
	private int age;
	private String photoUrl;

	public Member(String fullName, int age, String photoUrl) {
		this.fullName = fullName;
		this.age = age;
		this.photoUrl = photoUrl;
	}

	@Override
	public String toString() {
		return "Member [fullName=" + fullName + ", age=" + age + ", photoUrl=" + photoUrl + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Member m = (Member)obj;
		return this.fullName.equals(m.fullName) && this.age == m.age;
	}

}
