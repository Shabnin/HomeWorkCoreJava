package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool {

	/*
	 * One keyword (Extends) is used for the inheritance in Java for regular Class.
	 * An regular class can inherit one abstract class or regular class but it can
	 * not inherit Interface by extends keyword. Only one inheritance is possible in
	 * Java for regular Class. Above, ColumbiaUniversity regular class extends
	 * MedicalSchool regular Class. Since regular class can not have abstract
	 * method, the unimplemented methods from MedicalSchools appears here as
	 * override and got converted in implemented method.
	 */

	ColumbiaUniversity() {// Default Constructor declared here

	}
	// public abstract void chemistry();// Abstract Method
	// Method can not be declared in a regular class.
	// in regular class method is implemented.

	public void biology() {
		System.out.println("I am biology method of ColumbiaUniversity Regular Class.");

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

}
