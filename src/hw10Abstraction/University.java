package hw10Abstraction;

public interface University extends College, Hospital {

	/*
	 * One (extends) keyword is used for inheritance in Interface. An Interface can
	 * inherit more than one Interface (separated by comma) by extends keyword.
	 * Above, University extends two interfaces College & Hospital. An Interface
	 * can't inherit a regular class or an abstract class by extends keyword.
	 */

	/*
	 * University() { } // Default constructor created
	 */

	// Interfaces can not have constructor

	public default void gymnasium() { // Default type method is implemented here.

	}

	public static void library() { // Static type method is implemented here.

	}

	public void classSize();

	public void playGround();

	public void teacher();

}
