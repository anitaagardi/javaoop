package first;

public class Person {
	private String name;
	private int  age;
	private int salary;
	private String address;
	private static int mimimunSalary=120;
	public Person(String name, int age, int salary, String address) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	public String getDetailts(){
		return name+" "+age+" "+salary+" "+address;
	}
	public  static void setMinimumSalary(int salary){
		mimimunSalary=salary;
	}
	public static Person getMoreSalary(Person p1,Person p2){
		if(p1.salary>p2.salary){
			return p1;
		}
		return p2;
	}
	public int getDifferenceFromMinimumSalary(){
		return salary-mimimunSalary;
	}

}
