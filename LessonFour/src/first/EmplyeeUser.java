package first;

public class EmplyeeUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.name="Nagy Endre";
		employee.salary=250000;
		System.out.println(employee.getNameAndSalary());
		employee.addToSalary(2500);
		System.out.println(employee.getNameAndSalary());
	}

}
