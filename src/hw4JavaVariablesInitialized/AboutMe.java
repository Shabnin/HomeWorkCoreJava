package hw4JavaVariablesInitialized;

public class AboutMe {

	public String myCousinName; // variable declared

	public String myName = "Shabnin"; // variable initialized
	public byte myAge = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l;
	public float myHeight = 1.65473f;
	public double myGrade = 3.4665636567;
	public char myGender = 'F';
	public boolean fullTimeStudent = true;

	public AboutMe() { // Constructor Declared
		System.out.println("This is all about myself");
	}

	public void aboutMe() { // Method Implemented
		System.out.println("I am aboutMe method");
		System.out.println("My name is " + myName + "." + "\nMy gender is " + myGender + "." + " I am " + myAge
				+ " years old and I am" + myHeight + " feet tall." + " \nI earn $" + myYearlySalary + " and pay $"
				+ myApartmentRent + " as rent." + " Currently I have $" + myBankBalance + " in my bank." + "\nIt is "
				+ fullTimeStudent + " that I am a full time student and my grade is " + myGrade + ".");
	}

}
