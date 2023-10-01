package hw5Q2Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {

		System.out.println("This is from the default Constructor of the Student class.");
	}

	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;

		System.out.println("Student Name: " + stName + ", ID: " + stID + ", Gender: " + sex + ", Grade: " + grade
				+ " and Java Programmer? Ans: " + isProgrammer);
	}

}
