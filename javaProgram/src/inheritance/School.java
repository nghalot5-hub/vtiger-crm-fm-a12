package inheritance;

public class School {
 String scname, scadd;
 double scfees;
 
 School(){
	 }
 
 School(String scname,String scadd, double scfees){
	 this.scname=scname;
	 this.scadd=scadd;
	 this.scfees=scfees;
  }
	
 public String getSchoolDetails() {
	 return "School name is "+scname+"\nAddress of school is "+scadd+"\n School fee is "+scfees+"Rs";
	 }
 
}
