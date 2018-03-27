package fourth;

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
	public boolean isInBound(int lowerSalary, int upperSalary){
		if(salary>lowerSalary&&salary<upperSalary){
			return true ;
			
		}
		return false;
	}
	public int getTax(){
		return  (int) (salary*0.16);
	}
	public boolean isUpperSalaryThenOther(Employee employee){
		if(salary>employee.getSalary()){
			return true;
		}
		return false;
	}
}
