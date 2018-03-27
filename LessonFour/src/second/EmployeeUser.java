package second;

import second.Employee;

public class EmployeeUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setName("Nagy Endre");
		employee.setSalary(250000);
		System.out.println(employee.getNameAndSalary());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		employee.addToSalary(2500);
		System.out.println(employee.getSalary());
	}

}
