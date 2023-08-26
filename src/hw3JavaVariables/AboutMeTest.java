package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe me = new AboutMe(); // Object has been created here, AboutMe class has been instantiated &
									// Constructor is initialized

		System.out.println("My name is " + me.myName + "." + "\nMy gender is " + me.myGender + "." + " I am " + me.myAge
				+ " years old and I am" + me.myHeight + " feet tall." + " \nI earn $" + me.myYearlySalary + " and pay $"
				+ me.myApartmentRent + " as rent." + " Currently I have $" + me.myBankBalance + " in my bank."
				+ "\nIt is " + me.fullTimeStudent + " that I am a full time student and my grade is " + me.myGrade
				+ ".");

		me.aboutMe(); // Method Initialized
	}
}
