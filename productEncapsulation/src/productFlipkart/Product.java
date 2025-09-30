package productFlipkart;

public class Product {
	
		//private members
		private int pId;
	    private String pName;
	    private String pBrand;
	    private double pPrice;
	    private int pQuantity;
	    private double pRating;
	    
	    //Constructor
	    Product(){
	    	
	    }
	    
	    //setters
	    public void setpId(int pId) {
	    	if(pId>0)
	    		this.pId=pId;
	    	else
	    		System.out.println("Invalid Id enetered");			    	
	    }
	    
	    public void setpName(String pName) {
	    	if(pName.matches("[//A-Za-z]"))
	    		this.pName=pName;
	    	else
	    		System.out.println("Invalid name enetered");			    	
	    }
	    
	    public void setpBrand(String pBrand) {
	    	if(pBrand.matches("[//A-Za-z]"))
	    		this.pBrand=pBrand;
	    	else
	    		System.out.println("Invalid brand enetered");			    	
	    }
	    
	    public void setpQuantity(int pQuantity) {
	    	if(pQuantity>0)
	    		this.pQuantity=pQuantity;
	    	else
	    		System.out.println("Invalid quantity enetered");			    	
	    }
	    
	    
	    public void setpPrice(double pPrice) {
	    	if(pPrice>0)
	    		this.pPrice=pPrice;
	    	else
	    		System.out.println("Invalid price enetered");			    	
	    }
	    
	    
	    public void setpRating(double pRating) {
	    	if(pRating>0 && pRating<=5)
	    		this.pRating=pRating;
	    	else
	    		System.out.println("Invalid rating enetered");			    	
	    }
	    
	    //getters
	    
	    public int getpId() {
	    	return pId;		    	
	    }
	    
	    public String getpName() {
	    	return pName;		    	
	    }
	    
	    public String getpBrand() {
	    	return pBrand;	    	
	    }
	    
	    public int getpQuantity() {
	    	return pQuantity;    	
	    }
	    	    
	    public double getpPrice() {
	    	return pPrice;    	
	    }
	    
	    
	    public double getpRating() {
	    	return pRating;
	    }
	    
	   

}
