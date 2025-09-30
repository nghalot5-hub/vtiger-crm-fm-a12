package atomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	AtomicInteger count= new AtomicInteger(0);
	public void increment() {
		count.getAndIncrement();
		}
	public int getCount() {
		return count.get();
	}

}
