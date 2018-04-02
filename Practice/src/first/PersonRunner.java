package first;

import java.util.*;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("The number of Persons: ");
		int n;
		n = Integer.parseInt(sc.nextLine());
		Person[] persons = new Person[n];
		// String name, int age, int salary, String address
		for (int i = 0; i < persons.length; i++) {
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Age:");
			int age =Integer.parseInt(sc.nextLine());
			System.out.println("Salary: ");
			int salary = Integer.parseInt(sc.nextLine());
			System.out.println("Address: ");
			String address = sc.nextLine();
			persons[i]=new Person(name,age,salary,address);
		}
		Person maxSalaryPerson=persons[0];
		for(int i=0;i<persons.length;i++){
			maxSalaryPerson=Person.getMoreSalary(maxSalaryPerson, persons[i]);
		}
		for(int i=0;i<persons.length;i++){
			if(persons[i].getDifferenceFromMinimumSalary()<0){
				persons[i].getDetailts();
			}
		}
		Person.setMinimumSalary(150);
		for(int i=0;i<persons.length;i++){
			if(persons[i].getDifferenceFromMinimumSalary()<0){
				persons[i].getDetailts();
			}
		}
		

	}

}
