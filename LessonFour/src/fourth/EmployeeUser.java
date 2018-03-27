package fourth;

import fourth.Employee;

public class EmployeeUser {
	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee();
		}
		employees[0].setName("Nagy Kamilla");
		employees[1].setName("András Botond");
		employees[2].setName("Váradi Gábor");
		employees[3].setName("Kiss Géza");
		employees[0].setSalary(500000);
		employees[1].setSalary(350000);
		employees[2].setSalary(260000);
		employees[3].setSalary(400000);
		int maxSalaryIndex = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].isUpperSalaryThenOther(employees[maxSalaryIndex])) {
				maxSalaryIndex = i;
			}
		}
		System.out.println("Max salary: "+employees[maxSalaryIndex].getName()+" "+employees[maxSalaryIndex].getSalary());
		int countInSalaryInterval = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].isInBound(300000, 600000)) {
				countInSalaryInterval++;
			}
		}
		System.out.println("The count of Salaries between 30000 and 60000 " + countInSalaryInterval);
		double averageSalary = 0;
		for (int i = 0; i < employees.length; i++) {
			averageSalary = averageSalary + employees[i].getSalary();
		}
		averageSalary = averageSalary / employees.length;
		System.out.println("The average of the employee's salary " + averageSalary);
		int sumOfTaxes = 0;
		for (int i = 0; i < employees.length; i++) {
			sumOfTaxes += employees[i].getTax();
		}
		System.out.println("The sum of taxes " + sumOfTaxes);
	}
}
