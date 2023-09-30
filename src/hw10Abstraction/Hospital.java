package hw10Abstraction;

public interface Hospital {

	public default void morgue() {
		System.out.println("I am morgue method default in nature from Hospital interface.");

	}

	public static void pharmacy() {
		System.out.println("I am pharmacy method static in nature from Hospital interface.");
	}

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

}
