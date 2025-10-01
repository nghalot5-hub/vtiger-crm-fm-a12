package facebookEncapsulation;

public class SignUp {
	
	//private fields
	private String fullName;
    private String email;
    private String password;
    private String mobileNumber;
    private int age;
    
  //constructor
  	SignUp(){
  		
  	}
  	
  	 // Constructor
    public SignUp(String fullName, String email, String password, String mobileNumber, int age) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }
    
    //full name getter and setters
    public String getFullName() {
    	return fullName;
    }
    
    public void setFullName(String fullName) {
    	if(fullName.matches("[A-Za-z\\s]+")){
			this.fullName=fullName;
		}
		else
			System.out.println("Invalid fullName entered ");	
    }
    
    
    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String email) {  
    	if(email.contains("@") && email.endsWith(".com"))  
        this.email = email;
     else 
        System.out.println("Invalid email format.");
    }
    
    public String getPassword() {
    	return password;
    }
    
    public void setPassword(String password) {
    	if(password.length() >= 6) //Basic condition to check length of password greater than equals to 6
            this.password = password;
         else 
            System.out.println("Password must be at least 6 characters.");
    }
    
    public String getMobileNumber() {
    	return mobileNumber;
    }
    
    public void setMobileNumber(String mobileNumber) {
    	if(mobileNumber.matches("[//d{10}]"))         // Basic validation for 10-digit number
    		this.mobileNumber=mobileNumber;   
    	else
    		System.out.println("Enter valid 10-digit mobile number.");
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setAge(int age) {
    	if(age>13) // Facebook minimum age
    	this.age=age;   
    	else
            System.out.println("You must be 13 or older to create a Facebook account.");
    }

    
    
}
