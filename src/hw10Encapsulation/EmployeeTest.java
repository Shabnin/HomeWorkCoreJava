package hw10Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.setName("Alex");
		employee.setAge(25);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println(
				"Employee Name: " + employee.getName() + "\nEmployee Age: " + employee.getAge() + "\nEmployee Gender: "
						+ employee.getSex() + "\nEmployee Immigration Status: " + employee.isUsCitizen());

	}
}
