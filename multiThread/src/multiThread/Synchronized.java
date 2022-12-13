package multiThread;

public class Synchronized {
	public static void main(String args[])throws Exception {
		A obj=new A();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<100000;i++)
					obj.increment();
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<100000;i++)
					obj.increment();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count = "+obj.count);
	}
}
class A {
	int count;
	public synchronized void increment() {
		count++;
	}
}

