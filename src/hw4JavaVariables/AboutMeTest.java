package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe shabninInfo = new AboutMe(); // Object created, Class instantiated & Constructor initialized

		// Variable Initialized
		shabninInfo.myName = "Shabnin";
		shabninInfo.myAge = 127;
		shabninInfo.myApartmentRent = 32767;
		shabninInfo.myYearlySalary = 2147483647;
		shabninInfo.myBankBalance = 9223372036854775807l;
		shabninInfo.myHeight = 1.65473f;
		shabninInfo.myGrade = 3.4665636567;
		shabninInfo.myGender = 'F';
		shabninInfo.fullTimeStudent = true;

		shabninInfo.aboutMe(); // method initialized

		System.out.println("\n");

		AboutMe alexInfo = new AboutMe();// Object created, Class instantiated & Constructor initialized

		// Variable Initialized
		alexInfo.myName = "Alex";
		alexInfo.myAge = 29;
		alexInfo.myApartmentRent = 2000;
		alexInfo.myYearlySalary = 50000;
		alexInfo.myBankBalance = 800000000000l;
		alexInfo.myHeight = 5.6f;
		alexInfo.myGrade = 3.81111111;
		alexInfo.myGender = 'M';
		alexInfo.fullTimeStudent = true;

		alexInfo.aboutMe(); // method initialized

	}
}
