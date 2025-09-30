package encapsulation;

import java.util.Scanner;

public class driverEmploy {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employ name:");
		String name=sc.next();
		System.out.println("Enter employ age:");
		int age=sc.nextInt();
		System.out.println("Enter employ salary:");
		double salary=sc.nextDouble();
		Employee e1=new Employee();
		e1.setName(name);
		e1.setAge(age);
		e1.setSalary(salary);

		System.out.println("Employ name is " +e1.getName());
		System.out.println("Employ age is " +e1.getAge());		
		System.out.println("Employ salary is " +e1.getSalary());
		sc.close();
	}

}
