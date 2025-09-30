package reentrantLock;



public class User extends Thread{
			String name;
			reentrantLock.Counter c;
			int n;
			User(String name, reentrantLock.Counter c1, int n){
				this.name=name;
				this.c=c1;
				this.n=n;
			}
			
			public void run() {
				for(int i=1;i<=n;i++)
					c.increment();
				System.out.println(name+" has ended at: "+c.getCount());
			}
}
