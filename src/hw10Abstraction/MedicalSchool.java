package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool {

	/*
	 * One keyword (Extends) is used for the inheritance in Java for Abstract Class.
	 * An Abstract class can inherit one abstract class or regular class but it can
	 * not inherit Interface by extends keyword. Only one inheritance is possible in
	 * Java for Abstract Class. Above, MedicalSchool abstract class extends
	 * NursingSchool Abstract Class
	 */
	MedicalSchool() {// Default Constructor Declared

	}

	public abstract void anatomyLab();// Abstract method

	public void biochemistryLab() {// Non-abstract method

		System.out.println("I non abstract method of MedicalSchool Abstract Class");

	}

}
