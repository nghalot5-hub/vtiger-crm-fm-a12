package serialization;

import java.io.Serializable;

public class Person implements Serializable {
		private static final long serialVersionUID = 1L;
		private String name;
	    private int age;
	    private transient String password; // this field will *not* be serialized
	    
	    public Person(String name, int age, String password) {
	    	this.name=name;
	    	this.age=age;
	    	this.password=password;
	    }	
	    
	    @Override
	    public String toString() {
			return "Name is: "+name+
					"\n Age is: "+age+
					"\n Password is: "+password;	    	
	    }
}
