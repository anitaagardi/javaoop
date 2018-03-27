package second;

import java.time.*;

public class Employee {
	private String name;
	private LocalDate birth;
	private int salary;
	private static int retiringAge = 65;

	public Employee(String name, LocalDate birth, int salary) {
		super();
		this.name = name;
		this.birth = birth;
		this.salary = salary;
	}

	public Employee(String name, LocalDate birth) {
		super();
		this.name = name;
		this.birth = birth;
		LocalDate now = LocalDate.now();
		this.salary = (now.getYear() - birth.getYear()) * 10000;
	}

	public int getAgeToRetiring() {
		LocalDate now = LocalDate.now();
		return retiringAge - (now.getYear() - birth.getYear());
	}

	public String getDetails() {
		LocalDate now = LocalDate.now();
		return name + " " + (now.getYear() - birth.getYear()) + " " + salary + " " + getAgeToRetiring();
	}

	public void setRetiringAge(int age) {
		retiringAge = age;
	}

	public static Employee getSmallerRetiringAge(Employee emp1, Employee emp2) {
		if (emp1.getAgeToRetiring() < emp2.getAgeToRetiring()) {
			return emp1;
		}
		return emp2;
	}

	public String getAgeAndBithDay() {
		LocalDate now = LocalDate.now();
		return name + ", " + (now.getYear() - birth.getYear()) + " ," + birth + ": " + getMonthName() + " " + birth.getDayOfMonth();
	}

	public String getMonthName() {
		String[] monthNames = new String[] { "", "Január", "Február", "Március", "Április", "Május", "Június", "Július", "Augusztus", "Szeptember", "Október",
				"November", "December" };
		return monthNames[birth.getMonthValue()];

	}

}
