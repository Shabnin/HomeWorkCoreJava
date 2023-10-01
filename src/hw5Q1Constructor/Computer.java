package hw5Q1Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {// Default Constructor Declared
		System.out.println("This is from the default Constructor of Computer class");

	}

//Parameterized constructor declared

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {

		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("My Brand: " + brand + "\nModel: " + model + "\nOperating System: " + operatingSystem
				+ "\nPrice: " + price + "\nGrade: " + grade + "\nMade in the USA? " + "\nAns: " + madeInUSA + ".");
	}

	public Computer(String brand, String model) {

		this.brand = brand;
		this.model = model;

		System.out.println("I use " + brand + " Laptop and the model name is " + model);
	}

	public Computer(String operatingSystem, char grade) {

		this.operatingSystem = operatingSystem;
		this.grade = grade;

		System.out.println("It runs on " + operatingSystem + " and its " + grade + " grade.");

	}

	public Computer(int price, boolean madeInUSA) {

		this.price = price;
		this.madeInUSA = madeInUSA;

		System.out.println("By seeing such a high price like $" + price
				+ " I was curious to know the origin country of the laptop. \nThen I checked and found that my guess was "
				+ madeInUSA + " that it is from USA.");
	}
}
