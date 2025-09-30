package atomicInteger;
public class User extends Thread{
	String name;
	Counter c;
	int n;
	User(String name, Counter c, int n){
		this.name=name;
		this.c=c;
		this.n=n;
	}
	
	public void run() {
		for(int i=1;i<=n;i++)
			c.increment();
		System.out.println(name+" has ended at: "+c.getCount());
	}
}
