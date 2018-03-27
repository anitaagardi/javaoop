package second;

public class Employee {
	private String name;
	private int salary;
	public void addToSalary(int amount){
		salary=salary+amount;
	}
	public String getNameAndSalary(){
		return name+" "+salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
