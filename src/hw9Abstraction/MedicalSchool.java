package hw9Abstraction;

public abstract class MedicalSchool {

	MedicalSchool() {// Default Constructor Declared

	}

	public abstract void anatomyLab();// Abstract method

	public void biochemistryLab() {// Non-abstract method

		System.out.println("I non abstract method of MedicalSchool Abstract Class");

	}

}
