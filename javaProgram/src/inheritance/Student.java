package inheritance;

public class Student extends School{
	String stname, stadd;
	int rollno, div;
	
	Student(){
		super();
	}
	
	Student(String scname,String scadd, double scfees, String stname, String stadd, int rollno, int div){
		super(scname,scadd,scfees);
		this.stname=stname;
		this.stadd=stadd;
		this.rollno=rollno;
		this.div=div;		
	}
	
	 public String getStudentsDetails() {
		 return super.getSchoolDetails()+"\nStudent name is "+stname+"\nStudent address is "+stadd+"\n Student rollno is fee is "+rollno+"\nStudent division is  "+div;
		 }
	
}
