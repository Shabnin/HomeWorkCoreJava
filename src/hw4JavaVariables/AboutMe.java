package hw4JavaVariables;

public class AboutMe {

	// variable declared
	public String myName;
	public byte myAge;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean fullTimeStudent;

	public AboutMe() { // Constructor Declared
		System.out.println("This is all about us: ");
	}

	public void aboutMe() { // Method Implemented
		System.out.println("My name is " + myName + "." + "\nMy gender is " + myGender + "." + " I am " + myAge
				+ " years old and I am" + myHeight + " feet tall." + " \nI earn $" + myYearlySalary + " and pay $"
				+ myApartmentRent + " as rent." + " Currently I have $" + myBankBalance + " in my bank." + "\nIt is "
				+ fullTimeStudent + " that I am a full time student and my grade is " + myGrade + ".");
	}
}
