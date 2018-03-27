package third;

import third.Employee;

public class EmployeeUser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setName("Nagy Endre");
		employee.setSalary(250000);
		System.out.println(employee.getNameAndSalary());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		System.out.println("between 150.000 and 300.000? "+employee.isInBound(150000, 300000));
		System.out.println("between 15.000 and 30.000? "+employee.isInBound(15000, 30000));
		Employee employee2=new Employee();
		employee2.setName("Kiss Béla");
		employee2.setSalary(150000);
		System.out.println("Emp1 has more salary? "+employee.isUpperSalaryThenOther(employee2));
		System.out.println("Emp2 has more salary? "+employee2.isUpperSalaryThenOther(employee));
	}
}
