package reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
	
	Lock l1=new ReentrantLock();
	int count=0;
	public void increment() {
		l1.lock();
		try {
			count++;
			}
		finally {
			l1.unlock();
		}
		}
	public int getCount() {
		return count;
	}

}
