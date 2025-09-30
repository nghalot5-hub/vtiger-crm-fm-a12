package encapsulation;

public class Employee {
	private int age; //non-static method which is private and not be directly accessible in another class
	private	String name;
	private	double salary;
	
	//setter methods
	public void setAge(int age) {
		if(age>=18 && age<=65) {
			System.out.println("Valid Age " +age+ " years");
			this.age=age;
		}
		else
			System.out.println("Invalid age entered");
	}
	
	public void setName(String name) {
		if(name.matches("[A-Za-z\\s]+")){
			System.out.println("Valid Name " +name);
			this.name=name;
		}
		else
			System.out.println("Invalid name entered ");	
		}
	
	public void setSalary(double salary) {
		if(salary>=15000) {
			System.out.println("Valid Salary " +salary+ "Rs");
			this.salary=salary;
		}
		else
			System.out.println("Invalid Salary entered");	
		}

	//getter
	public int getAge() {
		//validation
		return age;
		}
	
	public String getName() {
		//validation
		return name;
		}
	
	public double getSalary() {
		//validation
		return salary;
		}
}
