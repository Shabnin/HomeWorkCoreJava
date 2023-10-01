package hw5Q1Constructor;

public class ComputerTest {
	public static void main(String[] args) {

		Computer computer = new Computer();// Default Constructor initialized

		// Computer hp = new Computer("HP", "Spectre");
		// Computer op = new Computer("Windows", 'A');
		// Computer price = new Computer(1500, true);
		System.out.println("\n----Configuration for Macbook-----\n");

		Computer appleFeatures = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
		// Parameterized constructor initialized.

		System.out.println("\n----Configuration for Windows Laptop-----\n");

		Computer hpFeatures = new Computer("HP", "Spectre", "Windows", 1500, 'A', false);
	}

}
