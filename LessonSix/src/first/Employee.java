package first;

public class Employee {
	private String name;
	private int age;
	private int salary;
	private static int retiringAge=65;
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.salary = age*10000;
	}
	public int getAgeToRetiring(){
		return retiringAge-age;
	}
	public String getDetails(){
		return name+" "+age+" "+salary+" "+getAgeToRetiring();
	}
	public void setRetiringAge(int age){
		retiringAge=age;
	}
	public static Employee getSmallerRetiringAge(Employee emp1, Employee emp2){
		if(emp1.getAgeToRetiring()<emp2.getAgeToRetiring()){
			return emp1;
		}
		return emp2;
	}
	

}
