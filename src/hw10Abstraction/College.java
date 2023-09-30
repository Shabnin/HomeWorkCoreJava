package hw10Abstraction;

public interface College {

	// One (extends) keyword is used for inheritance in Interface.

	public default void dorm() {

		System.out.println("I am dorm method default in nature from College interface.");
	}

	public static void studyRoom() {
		System.out.println("I am studyRoom method static in nature from College interface.");
	}

	public void commonRoom();

	public void laboratory();

	public void languageClub();

}
